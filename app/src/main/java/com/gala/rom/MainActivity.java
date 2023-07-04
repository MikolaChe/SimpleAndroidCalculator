package com.gala.rom;

import static com.gala.rom.R.id.plus_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    android.widget.EditText number_field_1;
    android.widget.EditText number_field_2;
    Button plus_button;
    Button minus_button;
    Button multiply_button;
    Button divide_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        number_field_1 = findViewById(R.id.number_field_1);
        number_field_2 = findViewById(R.id.number_field_2);
        plus_button = findViewById(R.id.plus_button);
        minus_button = findViewById(R.id.minus_button);
        multiply_button = findViewById(R.id.multiply_button);
        divide_button = findViewById(R.id.divide_button);


        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                float res = num1 + num2;
                resultTextView.setText(String.valueOf(res));
        }
        });

        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                float res = num1 - num2;
                resultTextView.setText(String.valueOf(res));
            }
        });

        multiply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                float res = num1 * num2;
                resultTextView.setText(String.valueOf(res));
            }
        });

        divide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                float res = num1 / num2;
                resultTextView.setText(String.valueOf(res));
            }
        });

    }

}