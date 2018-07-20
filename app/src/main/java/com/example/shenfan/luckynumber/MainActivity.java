package com.example.shenfan.luckynumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void drawNumber(View v)
    {
        //Step 1 - make a reference to the lucky number text view
        TextView luckyNumberTV = (TextView)findViewById(R.id.luckynumber);


        //Step 2 - Use random object to generate a random number
        Random r = new Random();
        int n = r.nextInt(100) + 1;


        //Step 3 - update lucky number text view
        luckyNumberTV.setText(String.valueOf(n));
    }
}
