package com.example.android.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.calculator.MainActivity.words;

public class CalculatorActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        TextView text = (TextView) findViewById(R.id.text);
        text.setText("0");

        TextView clear = (TextView) findViewById(R.id.clear);
        clear.setText("C");
    }

    protected String number1 = "";
    protected String number2 = "";
    protected String operator = "";
    protected double answer;

    //TextView text = (TextView) findViewById(R.id.text);
    public void set1(View view)
    {
        TextView text = (TextView) findViewById(R.id.text);

        if (operator == "")
        {
            number1  = number1 + "1";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "1";
            text.setText(number2);
        }
    }


    public void set2(View view)
    {

        TextView text = (TextView) findViewById(R.id.text);

        if (operator == "")
        {
            number1  = number1 + "2";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "2";
            text.setText(number2);
        }

    }


    public void set3(View view)
    {

        TextView text = (TextView) findViewById(R.id.text);

        if (operator == "")
        {
            number1  = number1 + "3";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "3";
            text.setText(number2);
        }

    }


    public void set4(View view)
    {

        TextView text = (TextView) findViewById(R.id.text);

        if (operator == "")
        {
            number1  = number1 + "4";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "4";
            text.setText(number2);
        }

    }


    public void set5(View view)
    {

        TextView text = (TextView) findViewById(R.id.text);

        if (operator == "")
        {
            number1  = number1 + "5";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "5";
            text.setText(number2);
        }

    }


    public void set6(View view)
    {

        TextView text = (TextView) findViewById(R.id.text);

        if (operator == "")
        {
            number1  = number1 + "6";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "6";
            text.setText(number2);
        }

    }


    public void set0(View view)
    {

        TextView text = (TextView) findViewById(R.id.text);

        if (operator == "")
        {
            number1  = number1 + "0";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "0";
            text.setText(number2);
        }

    }


    public void set7(View view)
    {

        TextView text = (TextView) findViewById(R.id.text);

        if (operator == "")
        {
            number1  = number1 + "7";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "7";
            text.setText(number2);
        }

    }


    public void set8(View view)
    {

        TextView text = (TextView) findViewById(R.id.text);
        if (operator == "")
        {
            number1  = number1 + "8";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "8";
            text.setText(number2);
        }

    }


    public void set9(View view)
    {

        TextView text = (TextView) findViewById(R.id.text);

        if (operator == "")
        {
            number1  = number1 + "9";
            text.setText(number1);
        }

        else
        {
            number2 = number2 + "9";
            text.setText(number2);
        }

    }


    public void result(View view)
    {                                   //its initiated when the user presses equals

        double x = Integer.parseInt(number1);  //this method transforms string to integer
        double y = Integer.parseInt(number2);  //for example, "123" to 123

        TextView text = (TextView) findViewById(R.id.text);
        TextView clear = (TextView) findViewById(R.id.clear);
        clear.setText("AC");

        if (operator == "X")
        {
            answer = x * y;
            String finalAnswer = new Double(answer).toString();     //transforming int to string
            text.setText(finalAnswer);                              //in order to set the text
        }

        else if (operator == "/")
        {
            answer = x / y;
            String finalAnswer = new Double(answer).toString();
            text.setText(finalAnswer);
        }

        else if (operator == "+")
        {
            answer = x + y;
            String finalAnswer = new Double(answer).toString();
            text.setText(finalAnswer);
        }

        else if (operator == "-")
        {
            answer = x - y;
            String finalAnswer = new Double(answer).toString();
            text.setText(finalAnswer);
        }

        words.add(new Answer(number1, number2, operator, answer));

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
        operator = "X";
    }


    public void setDivide(View view)
    {
        operator = "/";
    }


    public void reset(View view)
    {                                               //This method is for the button "AC"
        TextView text = (TextView) findViewById(R.id.text);
        text.setText("0");

        operator = "";
        number1 = "";
        number2 = "";
        answer = 0;
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
    {                 //this method find the percentage
        TextView text = (TextView) findViewById(R.id.text);
        double x = Integer.parseInt(number1);

        if(operator != "")
        {
            text.setText("Error!");
        }

        else
        {
            answer = x / 100;
            text.setText(new Double(answer).toString());
        }

    }


    public void changeSign(View view)
    {
        TextView text = (TextView) findViewById(R.id.text);
        double x = Integer.parseInt(number1);
        double y = Integer.parseInt(number2);

        if(operator == "")
        {
             if(x > 0)
             {
                 number1 = "-" + number1;
             }

            else
             {
                 //finish this part
                 //make it so that a negative number becomes positive
             }
        }


        else
        {
            if(y > 0 )
            {                    //this is checking if number is negative,
                number2 = "-" + number2;    //if it is, then it turns it into a negative number.
            }

            else
            {
                //finish this part
                //make it so that negative number becomes positive
            }
        }
    }


    public void toStorage(View view)
    {
        Intent intent = new Intent(this, StorageActivity.class);
        startActivity(intent);
    }

}
