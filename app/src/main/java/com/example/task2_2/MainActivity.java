package com.example.task2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText_input1 = findViewById(R.id.editText_input1);
        EditText editText_input2 = findViewById(R.id.editText_input2);
        EditText editText_sum = findViewById(R.id.editText_sum);

        Button button_add = findViewById(R.id.button_add);
        Button button_sub = findViewById(R.id.button_sub);
        Button button_multi = findViewById(R.id.button_multi);
        Button button_div = findViewById(R.id.button_div);
        Button button_clear = findViewById(R.id.button_clear);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strInput1 = editText_input1.getText().toString();
                String strInput2 = editText_input2.getText().toString();

                double sum = Double.valueOf(strInput1) + Double.valueOf(strInput2);

                editText_sum.setText(String.valueOf(sum));
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strInput1 = editText_input1.getText().toString();
                String strInput2 = editText_input2.getText().toString();

                double sum = Double.valueOf(strInput1) - Double.valueOf(strInput2);

                editText_sum.setText(String.valueOf(sum));
            }
        });
        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strInput1 = editText_input1.getText().toString();
                String strInput2 = editText_input2.getText().toString();

                double sum = Double.valueOf(strInput1) * Double.valueOf(strInput2);

                editText_sum.setText(String.valueOf(sum));
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strInput1 = editText_input1.getText().toString();
                String strInput2 = editText_input2.getText().toString();

                double sum = Double.valueOf(strInput1) / Double.valueOf(strInput2);

                editText_sum.setText(String.valueOf(sum));
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText_input1.getText().toString();
                editText_input2.getText().toString();

                editText_input1.setText("");
                editText_input2.setText("");
                editText_sum.setText("");
            }
        });


    }
}