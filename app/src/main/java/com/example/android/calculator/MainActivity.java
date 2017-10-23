package com.example.android.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import static com.example.android.calculator.StorageActivity.words;

public class MainActivity extends AppCompatActivity
{

    String number1 = "";
    String number2 = "";
    String operator = "";
    double answer;
    TextView text, clear;

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


    public void set1(View view)
    {
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

        clear.setText("AC");

        if (operator == "X")
        {
            answer = x * y;
            String finalAnswer = new Double(answer).toString();     //transforming int to string
            text.setText(finalAnswer);                              //in order to set the text
        }

        else if (operator == "/")
        {
            String finalAnswer = new Double(answer).toString();
            try {
                answer = x / y;
            } catch (ArithmeticException e){
                text.setText("Undefined");
            }
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


    public void changeSign(View view)
    {
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
