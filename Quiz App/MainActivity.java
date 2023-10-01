package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tq, question;

    Button next, bt1, bt2, bt3, bt4;

    int score = 0;
    int totalQuestion = questionAnswer.questionss.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question = findViewById(R.id.question);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        next = findViewById(R.id.button);
        tq = findViewById(R.id.tq);


        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        next.setOnClickListener(this);


        tq.setText("Total Questions: " + totalQuestion);


        loadNewQuestion();

    }

    @SuppressLint("ResourceAsColor")
    @Override

    public void onClick(View view) {

        bt1.setBackgroundColor(android.R.color.white);
        bt2.setBackgroundColor(android.R.color.white);
        bt3.setBackgroundColor(android.R.color.white);
        bt4.setBackgroundColor(android.R.color.white);

        Button clickedbutton = (Button) view;
        if (clickedbutton.getId() == R.id.button) {

            if(selectedAnswer.equals(questionAnswer.CorrectAnswer[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();

        }else

        {
            selectedAnswer = clickedbutton.getText().toString();
            clickedbutton.setBackgroundColor(Color.parseColor("green"));
        }
    }

    void loadNewQuestion(){

        if (currentQuestionIndex == totalQuestion){
            finishQuiz();
            return;
        }
        question.setText(questionAnswer.questionss[currentQuestionIndex]);
        bt1.setText(questionAnswer.choices[currentQuestionIndex][0]);
        bt2.setText(questionAnswer.choices[currentQuestionIndex][1]);
        bt3.setText(questionAnswer.choices[currentQuestionIndex][2]);
        bt4.setText(questionAnswer.choices[currentQuestionIndex][3]);
    }

    void  finishQuiz(){
        String passStatus  = "";
        if(score > totalQuestion * 0.60){
            passStatus = "passed";
        }
        else{
            passStatus = "failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("score is " + score + " out of "  + totalQuestion)
                .setPositiveButton("Restart" , ((dialogInterface, i) -> restartQuiz() ))
                .setCancelable(false)
                .show();
    }

    void restartQuiz(){
        score  = 0 ;
        currentQuestionIndex = 0 ;
        loadNewQuestion();
    }
}