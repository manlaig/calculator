package com.example.android.calculator;

/**
 * Created by manlai on 8/5/2017.
 */

public class Answer
{
    private String number1, number2, operator;
    private double answer;

    public Answer() {}

    public Answer(String mNumber1, String mNumber2, String mOperator, double mAnswer)
    {
        number1 = mNumber1;
        number2 = mNumber2;
        operator = mOperator;
        answer = mAnswer;
    }

    @Override
    public String toString()
    {
        return this.number1 + " " + this.operator + " " + this.number2 + " = " + this.answer;
    }
}
