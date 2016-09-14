package com.example.ag5300cm.surveyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SurveyAppActivation extends AppCompatActivity {

    private Button mYes_Button;
    private  Button mNo_Button;
    private Button mResults_Button;
    private TextView mSurvey_ResultsTextView;
    private TextView mquestion_text;
    private Button mReset_Button;

    int counterYes;
    //window.counterYes = counterYes;
    int counterNo;
    //Button addYes, addNo;


    //TextView displayQuestion = (TextView)findViewById(R.id.survey_question);
    //displayQuestion.
    //private void showSurveyQuestion() {
    //    string question =
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_app_activation);

        counterYes = 0; //to keep track for the survey
        counterNo = 0;

        mSurvey_ResultsTextView = (TextView) findViewById(R.id.survey_results);

        mYes_Button = (Button) findViewById(R.id.yes_button);
        mYes_Button.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                //everytime button clicked will add to counter
                counterYes = counterYes + 1; //or counterYes += 1; or counterYes++

            }

        });
        mNo_Button = (Button) findViewById(R.id.no_button);
        mNo_Button.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) { //to add all no's in survey
                counterNo = counterNo + 1;

            }

        });
        mResults_Button = (Button) findViewById(R.id.results_button);
        mResults_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                TextView output = (TextView)findViewById(R.id.survey_results);
                output.setText("Viking belivers:" + counterYes + "\n" +
                               "The unfaithful:" + counterNo);
            }
            //mSurvey_ResultsTextView.setText("Total for yes: " + counterYes)
        });
        mReset_Button = (Button) findViewById(R.id.reset_button);
        //unable to figure out yet...

        mReset_Button.setOnClickListener(new  View.OnClickListener() {
            //@Override
            public void onClick(View v) {
            counterYes = 0;
            counterNo = 0;
            TextView output = (TextView)findViewById(R.id.survey_results);
            output.setText("");
            }
        });

    }
}
