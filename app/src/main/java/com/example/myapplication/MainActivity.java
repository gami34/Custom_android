package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumbersClickListener clickListener = new NumbersClickListener();
        TextView number = (TextView) findViewById(R.id.textView);
        TextView family = (TextView) findViewById(R.id.textView2);
        TextView color = (TextView) findViewById(R.id.textView3);
        TextView phrase = (TextView) findViewById(R.id.textView4);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberActivity = new Intent(v.getContext(), NumberActivity.class);
                startActivity(numberActivity);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyActivity = new Intent(v.getContext(), FamilyActivity.class);
                startActivity(familyActivity);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorActivity = new Intent(v.getContext(), ColorActivity.class);
                startActivity(colorActivity);
            }
        });
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phraseActivity = new Intent(v.getContext(), PhraseActivity.class);
                startActivity(phraseActivity);
            }
        });
    }
}