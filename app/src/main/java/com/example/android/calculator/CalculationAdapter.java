package com.example.android.calculator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by manla on 11/15/2017.
 */

public class CalculationAdapter<Answer> extends ArrayAdapter {

    public CalculationAdapter(@NonNull Context context, int resource, ArrayList<Answer> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
