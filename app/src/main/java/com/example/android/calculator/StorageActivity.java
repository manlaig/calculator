package com.example.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class StorageActivity extends AppCompatActivity
{

    public static ArrayList<Answer> words = new ArrayList<Answer>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storage);

        for(int i = 0; i < words.size(); i++)
        {
            Answer ans = words.get(i);
            String answer = String.valueOf(ans.getAnswer());

            LinearLayout rootview = (LinearLayout) findViewById(R.id.storage);
            TextView wordview = new TextView(this);

            wordview.setText(ans.getNumber1() + " " + ans.getOperator() + " " + ans.getNumber2() + " = " + answer);
            wordview.setHeight(18);
            rootview.addView(wordview);

        }
    }
}
