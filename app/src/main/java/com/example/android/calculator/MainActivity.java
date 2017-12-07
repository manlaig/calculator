package com.example.android.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private static ArrayList<Answer> words = new ArrayList<>();
    private String number1 = "", number2 = "", operator = "";
    private double answer;
    private TextView text, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        text.setText("0");

        clear = (TextView) findViewById(R.id.clear);
        clear.setText("C");
    }

    public void result(View view)
    {
        double x = Double.parseDouble(number1);
        double y = Double.parseDouble(number2);

        clear.setText("AC");

        if(number1 != "" && number2 != "")
            return;

        if (operator == "*")
            answer = x * y;
        else if (operator == "/") {
            try {
                answer = x / y;
            } catch (Exception e) {
                text.setText("Undefined");
            }
        }
        else if (operator == "+")
            answer = x + y;
        else if (operator == "-")
            answer = x - y;

        text.setText(new Double(answer).toString());

        words.add(new Answer(number1, number2, operator, answer));
        resetNumbers();
    }

    private void resetNumbers()
    {
        operator = "";
        number1 = "";
        number2 = "";
        answer = 0.0;
    }

    public void resetAll(View view)
    {                                               //This method is for the button "AC"
        text.setText("0");
        clear.setText("C");
    }

    public void setFraction(View view)
    {
        if(operator == "")
            number1 = number1 + ".";
        else
            number2 = number2 + ".";
    }

    public void percentage(View view)
    {
        double x = Integer.parseInt(number1);

        if(operator != "")
            text.setText("Error!");
        else
        {
            answer = x / 100.0;
            text.setText(new Double(answer).toString());
        }
        resetNumbers();
    }

    public void goToStorageActivity(View view)
    {
        startActivity(new Intent(this, StorageActivity.class));
    }

    public static ArrayList<Answer> getWordsArray()
    {
        return words;
    }

    public void setPlus(View view)
    {
        operator = "+";
    }

    public void setMinus(View view)
    {
        operator = "-";
    }

    public void setMultiply(View view)
    {
        operator = "*";
    }

    public void setDivide(View view)
    {
        operator = "/";
    }

    public void set1(View view)
    {
        setNumber("1");
    }

    public void set2(View view)
    {
        setNumber("2");
    }

    public void set3(View view)
    {
        setNumber("3");
    }

    public void set4(View view)
    {
        setNumber("4");
    }

    public void set5(View view)
    {
        setNumber("5");
    }

    public void set6(View view)
    {
        setNumber("6");
    }

    public void set0(View view)
    {
        setNumber("0");
    }

    public void set7(View view)
    {
        setNumber("7");
    }

    public void set8(View view)
    {
        setNumber("8");
    }

    public void set9(View view)
    {
        setNumber("9");
    }

    private void setNumber(String num)
    {
        if (operator == "")
        {
            number1  += num;
            text.setText(number1);
        }
        else
        {
            number2 += num;
            text.setText(number2);
        }
    }

}
