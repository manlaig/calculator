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
        int i = 0;

        while(i < words.size())
        {
            Answer ans = words.get(i);
            String answer = String.valueOf(ans.answer);

            LinearLayout rootview = (LinearLayout) findViewById(R.id.storage);
            TextView wordview = new TextView(this);

            wordview.setText(ans.number1 + " " + ans.operator + " " + ans.number2 + " = " + answer);
            rootview.addView(wordview);

            i += 1;
        }
    }
}
