package com.example.basketball_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView score1;
    TextView score2;
    Button button1Team1;
    Button button2Team1;
    Button button3Team1;
    Button button1Team2;
    Button button2Team2;
    Button button3Team2;

    int scoreTeam1=0;
    int scoreTeam2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score1=findViewById(R.id.score1);
        score2=findViewById(R.id.score2);
        button1Team1=findViewById(R.id.first_team_score1);
        button2Team1=findViewById(R.id.first_team_score2);
        button3Team1=findViewById(R.id.first_team_score3);
        button1Team2=findViewById(R.id.second_team_score1);
        button2Team2=findViewById(R.id.second_team_score2);
        button3Team2=findViewById(R.id.second_team_score3);

        onClicks();
    }
    public void onClicks()
    {
        button1Team1.setOnClickListener(View ->{
            scoreTeam1+=2;
            firstTeam(scoreTeam1);
        });
        button2Team1.setOnClickListener(View ->
        {
            scoreTeam1+=3;
            firstTeam(scoreTeam1);
        });
        button3Team1.setOnClickListener(View ->
        {
            scoreTeam1=0;
            firstTeam(scoreTeam1);
        });
        button1Team2.setOnClickListener(view ->
        {
            scoreTeam2+=2;
            secondTeam(scoreTeam2);
        });
        button2Team2.setOnClickListener(View ->
        {
            scoreTeam2+=3;
            secondTeam(scoreTeam2);
        });
        button3Team2.setOnClickListener(View ->
        {
            scoreTeam2=0;
            secondTeam(scoreTeam2);
        });
    }
    public void firstTeam(int s1)
    {
        score1.setText("" +s1);
    }
    public void secondTeam(int s2)
    {
        score2.setText("" +s2);
    }

}