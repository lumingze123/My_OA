package com.example.my_oa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {

    private EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et11,et12,et13,et14,et15,et16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        et1 = findViewById(R.id.et_1);
        et2 = findViewById(R.id.et_2);
        et3 = findViewById(R.id.et_3);
        et4 = findViewById(R.id.et_4);
        et5 = findViewById(R.id.et_5);
        et6 = findViewById(R.id.et_6);
        et7 = findViewById(R.id.et_7);
        et8 = findViewById(R.id.et_8);
        et9 = findViewById(R.id.et_9);
        et11 = findViewById(R.id.et_11);
        et12 = findViewById(R.id.et_12);
        et13 = findViewById(R.id.et_13);
        et14 = findViewById(R.id.et_14);
        et15 = findViewById(R.id.et_15);
        et16 = findViewById(R.id.et_16);


    }

    public void button(View view){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("1", et1.getText().toString());
        intent.putExtra("2", et2.getText().toString());
        intent.putExtra("3", et3.getText().toString());
        intent.putExtra("4", et4.getText().toString());
        intent.putExtra("5", et5.getText().toString());
        intent.putExtra("6", et6.getText().toString());
        intent.putExtra("7", et7.getText().toString());
        intent.putExtra("8", et8.getText().toString());
        intent.putExtra("9", et9.getText().toString());
        intent.putExtra("11", et11.getText().toString());
        intent.putExtra("12", et12.getText().toString());
        intent.putExtra("13", et13.getText().toString());
        intent.putExtra("14", et14.getText().toString());
        intent.putExtra("15", et15.getText().toString());
        intent.putExtra("16", et16.getText().toString());

        startActivity(intent);

    }

}
