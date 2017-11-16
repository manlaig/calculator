package com.example.android.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    public static ArrayList<Answer> words = new ArrayList<Answer>();

    private String number1 = "";
    private String number2 = "";
    private String operator = "";
    private double answer;
    private TextView text, clear;
    private ListView listView;
    private ArrayAdapter<Answer> calculationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        calculationAdapter = new CalculationAdapter(this, android.R.layout.simple_list_item_1, words);
        //listView.setAdapter(arrayAdapter);

        text = (TextView) findViewById(R.id.text);
        text.setText("0");

        clear = (TextView) findViewById(R.id.clear);
        clear.setText("C");
    }


    public void setNumber(String num)
    {
        if (operator == "")
        {
            number1  = number1 + num;
            text.setText(number1);
        }
        else
        {
            number2 = number2 + num;
            text.setText(number2);
        }
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


    public void result(View view)
    {
        int x = Integer.parseInt(number1);
        int y = Integer.parseInt(number2);

        clear.setText("AC");

        if (operator == "*")
        {
            answer = x * y;
            text.setText(new Double(answer).toString());
        }
        else if (operator == "/")
        {
            try
            {
                answer = x / (double) y;
            } catch (ArithmeticException e)
            {
                text.setText("Undefined");
            }

            text.setText(new Double(answer).toString());
        }
        else if (operator == "+")
        {
            answer = x + y;
            text.setText(new Double(answer).toString());
        }
        else if (operator == "-")
        {
            answer = x - y;
            text.setText(new Double(answer).toString());
        }

        calculationAdapter.add(new Answer(number1, number2, operator, answer));

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


    public void reset(View view)
    {                                               //This method is for the button "AC"
        text.setText("0");
        clear.setText("C");
        operator = "";
        number1 = "";
        number2 = "";
        answer = 0.0;
    }


    public void setFraction(View view)
    {
        if(operator == "")
        {
            number1 = number1 + ".";
        }

        else
        {
            number2 = number2 + ".";
        }
    }


    public void percentage(View view)
    {
        double x = Integer.parseInt(number1);

        if(operator != "")
        {
            text.setText("Error!");
        }

        else
        {
            answer = x / 100.0;
            text.setText(new Double(answer).toString());
        }

    }

    public void toStorage(View view)
    {
        Intent intent = new Intent(this, StorageActivity.class);
        startActivity(intent);
    }

}
