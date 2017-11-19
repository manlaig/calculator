package com.example.android.calculator;

/**
 * Created by manla on 8/5/2017.
 */

public class Answer
{
    private String number1;
    private String number2;
    private String operator;
    private double answer;


    public Answer(String mNumber1, String mNumber2, String mOperator, double mAnswer)
    {
        number1 = mNumber1;
        number2 = mNumber2;
        operator = mOperator;
        answer = mAnswer;
    }

    public String getNumber1() {
        return this.number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return this.number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getAnswer() {
        return this.answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return this.number1 + " " + this.operator + " " + this.number2 + " = " + this.answer;
    }

    public void isNegative(boolean negative)
    {

    }

    public void isPositive(boolean positive)
    {

    }
}
