package com.example.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView intent_view_answer;
    EditText intent_et_number1 ;
    EditText intent_et_number2;

    String num1;
    String num2;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        intent_et_number1 = findViewById(R.id.intent_et_number1);
        intent_et_number2 = findViewById(R.id.intent_et_number2);
        intent_view_answer = findViewById(R.id.intent_view_answer);

        Intent intentObj = getIntent();
        num1 = intentObj.getStringExtra("n1");
        num2 = intentObj.getStringExtra("n2");

        intent_et_number1.setText(num1);
        intent_et_number2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);



    }

    public void add(View view){
        intent_view_answer.setText(num1 + "+" + num2 + "=" + (n1 + n2));
    }

    public void minus(View view){
        intent_view_answer.setText(num1 + "-" + num2 + "=" + (n1 - n2));
    }

    public void multiply(View view){
        intent_view_answer.setText(num1 + "*" + num2 + "=" + (n1 * n2));
    }

    public void devide(View view){
        intent_view_answer.setText(num1 + "/" + num2 + "=" + (n1 / n2));
    }
}