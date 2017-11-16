package com.example.android.calculator;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manla on 11/15/2017.
 */

public class CalculationAdapter extends ArrayAdapter<Answer> {

    private ArrayList<Answer> answersList;

    public CalculationAdapter(Context context, int resource, ArrayList<Answer> objects) {
        super(context, resource, objects);
        answersList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = ((Activity) getContext()).getLayoutInflater().inflate(android.R.layout.simple_list_item_1, null);
        Answer answerAtPosition = answersList.get(position);
        TextView textView = (TextView) convertView.findViewById(android.R.id.text1);
        textView.setTextSize(22);
        textView.setTextColor(Color.BLACK);
        textView.setText(answerAtPosition.toString());

        return convertView;
    }
}
