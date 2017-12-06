package com.example.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StorageActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storage);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<Answer> calculationAdapter = new CalculationAdapter(this, android.R.layout.simple_list_item_1, MainActivity.getWordsArray());
        listView.setAdapter(calculationAdapter);
    }
}
