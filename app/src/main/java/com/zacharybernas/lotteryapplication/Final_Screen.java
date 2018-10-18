package com.zacharybernas.lotteryapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Final_Screen extends AppCompatActivity {

    String prob_pb;
    TextView powerball_Num;
    TextView user_numbers;
    Button gen_powerball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final__screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        powerball_Num = (TextView) findViewById(R.id.powerball_Num);
        user_numbers = (TextView) findViewById(R.id.user_numbers);
        gen_powerball = (Button) findViewById(R.id.gen_powerball);


        Prob_generator pb = new Prob_generator();
        prob_pb = pb.powballNum(prob_pb);
        powerball_Num.setText(prob_pb);


        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("lottery_num", Context.MODE_PRIVATE);

        if(sharedPref.getString("didEasy","").compareTo("0")==0){
            user_numbers.setText(sharedPref.getString("whiteBalls","")+sharedPref.getString("powerBall",""));
        }
        else{
            user_numbers.setText(sharedPref.getString("easyPick",""));
        }

        gen_powerball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Final = new Intent(view.getContext(), Lottery_Main.class);
                startActivity(Final);
            }
        });


    }

}
