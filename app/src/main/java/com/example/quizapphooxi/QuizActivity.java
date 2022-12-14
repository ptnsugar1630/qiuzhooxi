 package com.example.quizapphooxi;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

 public class QuizActivity extends AppCompatActivity {
     private TextView questions;
     private TextView question;

     private AppCompatButton option1, option2, option3, option4;
     private AppCompatButton nextBtn;
     private Timer quizTimer;
     private int totalTimeInMins = 1;
     private int seconds = 0;
     private List<QuestionsList> questionsLists ;
     private int currentQuestionPosition = 0;
     private String selectedOptionByUser ="";

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_quiz);

         final ImageView backbtn = findViewById(R.id.backbtn);
         final TextView timer = findViewById(R.id.timer);
         final TextView selectedTopicName = findViewById(R.id.topicname);

         questions = findViewById(R.id.questions);
         question = findViewById(R.id.question);

         option1 = findViewById(R.id.option1);
         option2 = findViewById(R.id.option2);
         option3 = findViewById(R.id.option3);
         option4 = findViewById(R.id.option4);

         nextBtn = findViewById(R.id.nextBtn);

         final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");
         selectedTopicName.setText(getSelectedTopicName);

         questionsLists = QuestionBank.getQuestions(getSelectedTopicName);

         startTimer(timer);
         questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
         question.setText(questionsLists.get(0).getQuestion());
         option1.setText(questionsLists.get(0).getOption1());
         option2.setText(questionsLists.get(0).getOption2());
         option3.setText(questionsLists.get(0).getOption3());
         option4.setText(questionsLists.get(0).getOption4());


         option1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(selectedOptionByUser.isEmpty()){
                     selectedOptionByUser = option1.getText().toString();

                     option1.setBackgroundResource(R.drawable.round_back_red10);
                     option1.setTextColor(Color.WHITE);

                     revealAnswer();

                     questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                 }

             }
         });
         option2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(selectedOptionByUser.isEmpty()){
                     selectedOptionByUser = option2.getText().toString();

                     option2.setBackgroundResource(R.drawable.round_back_red10);
                     option2.setTextColor(Color.WHITE);

                     revealAnswer();

                     questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                 }

             }
         });
         option3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(selectedOptionByUser.isEmpty()){
                     selectedOptionByUser = option3.getText().toString();

                     option3.setBackgroundResource(R.drawable.round_back_red10);
                     option3.setTextColor(Color.WHITE);

                     revealAnswer();

                     questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                 }

             }
         });
         option4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(selectedOptionByUser.isEmpty()){
                     selectedOptionByUser = option4.getText().toString();

                     option4.setBackgroundResource(R.drawable.round_back_red10);
                     option4.setTextColor(Color.WHITE);

                     revealAnswer();

                     questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                 }

             }
         });
         nextBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (selectedOptionByUser.isEmpty()){
                     Toast.makeText(QuizActivity.this, "vui l??ng ch???n l???i", Toast.LENGTH_SHORT).show();
                 }
                 else {
                     changeNextQuestion();

                 }


             }
         });

         backbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 quizTimer.purge();
                 quizTimer.cancel();

                 startActivity(new Intent(QuizActivity.this, MainActivity.class));
                 finish();
             }
         });
     }
     private void changeNextQuestion(){
         currentQuestionPosition++;
         if ((currentQuestionPosition+1) == questionsLists.size()){
             nextBtn.setText("X??c nh???n k???t qu???");
         }
         if (currentQuestionPosition < questionsLists.size()){
             selectedOptionByUser = "";
             option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
             option1.setTextColor(Color.parseColor("#CD8F7E"));

             option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
             option2.setTextColor(Color.parseColor("#CD8F7E"));

             option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
             option3.setTextColor(Color.parseColor("#CD8F7E"));

             option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
             option4.setTextColor(Color.parseColor("#CD8F7E"));

             questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
             question.setText(questionsLists.get(currentQuestionPosition).getQuestion());
             option1.setText(questionsLists.get(currentQuestionPosition).getOption1());
             option2.setText(questionsLists.get(currentQuestionPosition).getOption2());
             option3.setText(questionsLists.get(currentQuestionPosition).getOption3());
             option4.setText(questionsLists.get(currentQuestionPosition).getOption4());

         }
         else {
             Intent intent = new Intent(QuizActivity.this, QuizResults.class);
             intent.putExtra( "Ch??nh x??c", getCorrectAnswers());
             intent.putExtra("Ch??a ch??nh x??c", getInCorrectAnswers());
             startActivity(intent);
             finish();

         }
     }


     private void startTimer(TextView timerTextView) {
         quizTimer = new Timer();
         quizTimer.scheduleAtFixedRate(new TimerTask() {
             @Override
             public void run() {
                 if (seconds == 0) {
                     totalTimeInMins--;
                     seconds = 59;
                 } else if (seconds == 0 && totalTimeInMins == 0) {
                     quizTimer.purge();
                     quizTimer.cancel();
                     Toast.makeText(QuizActivity.this, "H???t gi???", Toast.LENGTH_SHORT).show();
                     Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                     intent.putExtra("Ch??nh x??c", getCorrectAnswers());
                     intent.putExtra("Ch??a ch??nh x??c", getInCorrectAnswers());
                     startActivity(intent);

                     finish();

                 }
                 else {
                     seconds--;
                 }
                 runOnUiThread(new Runnable() {
                     @Override
                     public void run() {


                         String finalMinutes = String.valueOf(totalTimeInMins);
                         String finalSecond = String.valueOf(seconds);

                         if(finalMinutes.length() == 1);{
                             finalSecond = "0"+finalSecond;
                         }
                         timerTextView.setText(finalMinutes+":"+finalSecond);

                     }
                 });

             }
         }, 1000, 1000);

     }

     private int getCorrectAnswers() {
         int correctAnswers = 0;
         for (int i = 0; i < questionsLists.size(); i++) {


             final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
             final String getAnswer = questionsLists.get(i).getAnswer();

             if (getUserSelectedAnswer.equals(getAnswer)) {
                 correctAnswers++;
             }

         }
         return correctAnswers;
     }
     private int getInCorrectAnswers() {
         int correctAnswers = 0;
         for (int i = 0; i < questionsLists.size(); i++) {


             final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
             final String getAnswer = questionsLists.get(i).getAnswer();

             if (!getUserSelectedAnswer.equals(getAnswer)) {
                 correctAnswers++;
             }

         }
         return correctAnswers;
     }


     @Override
     public void onBackPressed() {
         quizTimer.purge();
         quizTimer.cancel();

         startActivity(new Intent(QuizActivity.this, MainActivity.class));
         finish();

     }
     private void  revealAnswer(){
         final String getAnswer = questionsLists.get(currentQuestionPosition).getAnswer();
         if (option1.getText().toString().equals(getAnswer)){
         option1.setBackgroundResource(R.drawable.round_back_green10);
         option1.setTextColor(Color.WHITE);
         }
         else if (option2.getText().toString().equals(getAnswer)) {
             option2.setBackgroundResource(R.drawable.round_back_green10);
             option2.setTextColor(Color.WHITE);
         }
         else if (option3.getText().toString().equals(getAnswer)) {
             option3.setBackgroundResource(R.drawable.round_back_green10);
             option3.setTextColor(Color.WHITE);
         }
         else if (option4.getText().toString().equals(getAnswer)) {
             option4.setBackgroundResource(R.drawable.round_back_green10);
             option4.setTextColor(Color.WHITE);
         }

     }
 }
