package com.example.prgm9;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
{
   EditText num1,num2;
   TextView result;
   RadioGroup radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);
        radio = (RadioGroup) findViewById(R.id.radio);
    }
    public void onClick(View view) {
        double number1 = Double.parseDouble(num1.getText().toString());
        double number2 = Double.parseDouble(num2.getText().toString());

        double calculationResult = 0;
        if (view.getId() == R.id.add) {
            calculationResult = number1 + number2;
        } else if (view.getId() == R.id.sub) {
            calculationResult = number1 - number2;
        } else if (view.getId() == R.id.mul) {
            calculationResult = number1 * number2;
        } else if (view.getId() == R.id.div) {
            calculationResult = number1 / number2;
        }

        result.setText("Result: " + calculationResult);
    }
}