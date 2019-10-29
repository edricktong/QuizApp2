package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    private TextView textViewScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Intent lastIntent = getIntent();
        int score = lastIntent.getIntExtra(MainActivity.EXTRA_SCORE, 0);
        wireWidgets();
        textViewScore.setText("Score: " + score);
    }

    private void wireWidgets() {
        textViewScore = findViewById(R.id.textView_score_score);
    }
}
