package com.example.Week8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textOutput;
    private EditText number1EditText, number2EditText;
    private Button addButton, subtractButton, multiplyButton, divideButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1EditText = findViewById(R.id.number1EditText);
        number2EditText = findViewById(R.id.number2EditText);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        textOutput = findViewById(R.id.calculatedtextView);
    }

    public void addition(View view) {
        double number1 = Double.parseDouble(number2EditText.getText().toString());
        double number2 = Double.parseDouble(number1EditText.getText().toString());
        double result = number1 + number2;
        textOutput.setText(String.format("%.0f",result));
    }
    public void subtraction(View view) {
        double number1 = Double.parseDouble(number2EditText.getText().toString());
        double number2 = Double.parseDouble(number1EditText.getText().toString());
        double result = number1 - number2;
        textOutput.setText(String.format("%.0f",result));
    }

    public void multiply(View view) {
        double number1 = Double.parseDouble(number2EditText.getText().toString());
        double number2 = Double.parseDouble(number1EditText.getText().toString());
        double result = number1 * number2;
        //String resultOutput = String.valueOf(result);
        textOutput.setText(String.format("%.0f",result));
    }

    public void divide(View view) {
        double number1 = Double.parseDouble(number2EditText.getText().toString());
        double number2 = Double.parseDouble(number1EditText.getText().toString());
        double result = number1 / number2;

        textOutput.setText(String.format("%.2f",result));
    }
}