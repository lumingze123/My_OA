package com.example.my_oa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv11,tv12,tv13,tv14,tv15,tv16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv_1);
        tv2 = findViewById(R.id.tv_2);
        tv3 = findViewById(R.id.tv_3);
        tv4 = findViewById(R.id.tv_4);
        tv5 = findViewById(R.id.tv_5);
        tv6 = findViewById(R.id.tv_6);
        tv7 = findViewById(R.id.tv_7);
        tv8 = findViewById(R.id.tv_8);
        tv9 = findViewById(R.id.tv_9);
        tv11 = findViewById(R.id.tv_11);
        tv12 = findViewById(R.id.tv_15);
        tv13 = findViewById(R.id.tv_13);
        tv14 = findViewById(R.id.tv_14);
        tv15 = findViewById(R.id.tv_15);
        tv16 = findViewById(R.id.tv_16);
        String t1 = getIntent().getStringExtra("1");
        String t2 = getIntent().getStringExtra("2");
        String t3 = getIntent().getStringExtra("3");
        String t4 = getIntent().getStringExtra("4");
        String t5 = getIntent().getStringExtra("5");
        String t6 = getIntent().getStringExtra("6");
        String t7 = getIntent().getStringExtra("7");
        String t8 = getIntent().getStringExtra("8");
        String t9 = getIntent().getStringExtra("9");
        String t11 = getIntent().getStringExtra("11");
        String t12 = getIntent().getStringExtra("12");
        String t13 = getIntent().getStringExtra("13");
        String t14 = getIntent().getStringExtra("14");
        String t15 = getIntent().getStringExtra("15");
        String t16 = getIntent().getStringExtra("16");

        tv1.setText(t1);
        tv2.setText(t2);
        tv3.setText(t3);
        tv4.setText(t4);
        tv5.setText(t5);
        tv6.setText(t6);
        tv7.setText(t7);
        tv8.setText(t8);
        tv9.setText(t9);
        tv11.setText(t11);
        tv12.setText(t12);
        tv13.setText(t13);
        tv14.setText(t14);
        tv15.setText(t15);
        tv16.setText(t16);
    }
}
