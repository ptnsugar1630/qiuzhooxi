package com.example.quizapphooxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout lichsu = findViewById(R.id.Sulayout);
        final LinearLayout toan = findViewById(R.id.Toanlayout);
        final LinearLayout hoahoc = findViewById(R.id.HoaLayout);
        final LinearLayout sinhhoc = findViewById(R.id.SinhLayout);

        final Button startBtn = findViewById(R.id.Startbtn);

        lichsu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                selectedTopicName = "lichsu";
                lichsu.setBackgroundResource(R.drawable.round_back_white_stroke10);

                toan.setBackgroundResource(R.drawable.round_back_white10);
                hoahoc.setBackgroundResource(R.drawable.round_back_white10);
                sinhhoc.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        toan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "toan";
                toan.setBackgroundResource(R.drawable.round_back_white_stroke10);

                lichsu.setBackgroundResource(R.drawable.round_back_white10);
                hoahoc.setBackgroundResource(R.drawable.round_back_white10);
                sinhhoc.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        hoahoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "hoahoc";
                hoahoc.setBackgroundResource(R.drawable.round_back_white_stroke10);

                toan.setBackgroundResource(R.drawable.round_back_white10);
                lichsu.setBackgroundResource(R.drawable.round_back_white10);
                sinhhoc.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        sinhhoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "sinhhoc";
                sinhhoc.setBackgroundResource(R.drawable.round_back_white_stroke10);

                toan.setBackgroundResource(R.drawable.round_back_white10);
                lichsu.setBackgroundResource(R.drawable.round_back_white10);
                lichsu.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"vui lòng chọn chủ đề.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}