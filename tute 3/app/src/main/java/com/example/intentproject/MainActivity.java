package com.example.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText intent_et_number1 ;
    EditText intent_et_number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent_et_number1 = findViewById(R.id.intent_et_number1);
        intent_et_number2 = findViewById(R.id.intent_et_number2);

    }
    //navigation part using intent
    public void openSecond(View view){

        Intent intentObject = new Intent(this , SecondActivity.class);

        String num1 = intent_et_number1.getText().toString();
        String num2 = intent_et_number2.getText().toString();

        intentObject.putExtra("n1" , num1);
        intentObject.putExtra("n2" , num2);

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.custom_toast,findViewById(R.id.intent_view_toastView));

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM ,0,0);
        toast.setView(layout);
        toast.show();


        startActivity(intentObject);



    }
}