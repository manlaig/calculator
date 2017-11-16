package com.example.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StorageActivity extends AppCompatActivity
{
    ListView listView;
    ArrayAdapter<Answer> calculationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storage);

        listView = (ListView) findViewById(R.id.listView);
        calculationAdapter = new CalculationAdapter(this, android.R.layout.simple_list_item_1, MainActivity.words);
        listView.setAdapter(calculationAdapter);

    }
}
