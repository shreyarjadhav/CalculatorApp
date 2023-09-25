package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        double a = Double.parseDouble(myTextField1.getText().toString());
        double b = Double.parseDouble(myTextField2.getText().toString());
        double c = a+b;
        goToActivity(""+c);
    }

    public void clickSubtract(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        double a = Double.parseDouble(myTextField1.getText().toString());
        double b = Double.parseDouble(myTextField2.getText().toString());
        double c = a-b;
        goToActivity(""+c);
    }

    public void clickMultiply(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        double a = Double.parseDouble(myTextField1.getText().toString());
        double b = Double.parseDouble(myTextField2.getText().toString());
        double c = a*b;
        goToActivity(""+c);
    }

    public void clickDivide(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        double a = Double.parseDouble(myTextField1.getText().toString());
        double b = Double.parseDouble(myTextField2.getText().toString());
        double c = a / b;
        if(Double.isInfinite(c)){
            Toast.makeText(MainActivity.this, "Divide By Zero Error", Toast.LENGTH_LONG).show();
        }
        else {
            goToActivity("" + c);
        }
    }

    public void goToActivity(String s){
        Intent intent=new Intent(this, Results.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}