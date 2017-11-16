package com.example.android.calculator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manla on 11/15/2017.
 */

public class CalculationAdapter extends ArrayAdapter<Answer> {

    public CalculationAdapter(@NonNull Context context, int resource, ArrayList<Answer> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Answer answerAtPosition = getItem(position);
        TextView textView = (TextView) convertView;
        String answer = answerAtPosition.getNumber1() + " " + answerAtPosition.getOperator() + " " +
                answerAtPosition.getNumber2() + " = " + answerAtPosition.getAnswer();

        textView.setText(answer);

        return super.getView(position, convertView, parent);
    }
}
