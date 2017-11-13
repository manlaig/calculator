package com.example.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class StorageActivity extends AppCompatActivity
{

    public static ArrayList<Answer> words = new ArrayList<Answer>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storage);

    }
}
