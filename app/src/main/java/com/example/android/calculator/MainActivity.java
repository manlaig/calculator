package com.example.android.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static ArrayList<Answer> words = new ArrayList<Answer>();

    public void goToCalculator(View view){
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }

    public void goToStorage(View view) {
        Intent intent2 = new Intent(this, StorageActivity.class);
        startActivity(intent2);
    }
}
