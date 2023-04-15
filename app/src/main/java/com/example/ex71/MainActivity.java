package com.example.ex71;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, equal, clear, dot, plusminus;
    TextView tv;
    double current, last, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);
        dot = findViewById(R.id.dot);
        plusminus = findViewById(R.id.plusminus);
        tv = findViewById(R.id.result);
    }

    public void one(View view) {
        tv.setText(tv.getText() + "1");
    }
    public void two(View view) {
        tv.setText(tv.getText() + "2");
    }
    public void three(View view) {
        tv.setText(tv.getText() + "3");
    }
    public void four(View view) {
        tv.setText(tv.getText() + "4");
    }
    public void five(View view) {
        tv.setText(tv.getText() + "5");
    }
    public void six(View view) {
        tv.setText(tv.getText() + "6");
    }
    public void seven(View view) {
        tv.setText(tv.getText() + "7");
    }
    public void eight(View view) {
        tv.setText(tv.getText() + "8");
    }
    public void nine(View view) {
        tv.setText(tv.getText() + "9");
    }
    public void zero(View view) {
        tv.setText(tv.getText() + "0");
    }
    public void dot(View view) {
        tv.setText(tv.getText() + ".");
    }
    public void plusminus(View view) {
        if (tv.getText().toString().charAt(0) == '-'){
            tv.setText(tv.getText().toString().substring(1));
        }
        else if (tv.getText().toString().charAt(0) != '-') {
            tv.setText("-" + tv.getText());
        }
    }
    public void clear(View view) {
        tv.setText("");
    }
    public void add(View view) {
        if (current == 0) {
            last = Double.parseDouble(tv.getText().toString());
            tv.setText("");
            current = 1;
        }
    }
    public void sub(View view) {
        if (current == 0) {
            last = Double.parseDouble(tv.getText().toString());
            tv.setText("");
            current = 2;
        }
    }
    public void mul(View view) {
        if (current == 0) {
            last = Double.parseDouble(tv.getText().toString());
            tv.setText("");
            current = 3;
        }
    }
    public void div(View view) {
        if (current == 0) {
            last = Double.parseDouble(tv.getText().toString());
            tv.setText("");
            current = 4;
        }
    }
    public void equal(View view) {
        if (current == 1) {
            result = last + Double.parseDouble(tv.getText().toString());
            tv.setText(result + "");
        }
        if (current == 2) {
            result = last - Double.parseDouble(tv.getText().toString());
            tv.setText(result + "");
        }
        if (current == 3) {
            result = last * Double.parseDouble(tv.getText().toString());
            tv.setText(result + "");
        }
        if (current == 4) {
            result = last / Double.parseDouble(tv.getText().toString());
            tv.setText(result + "");
        }
        current = 0;
    }



}