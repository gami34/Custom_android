package com.example.myapplication;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class ColorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("red", "lutti"));
        words.add(new Word("blue", "otiiko"));
        words.add(new Word("green", "tolookosu"));
        words.add(new Word("yellow", "oyyisa"));
        words.add(new Word("orange", "massokka"));
        words.add(new Word("black", "temmokka"));
        words.add(new Word("white", "kenekaku"));
        words.add(new Word("brown", "kawinta"));
        words.add(new Word("magenta", "wo'e"));
        words.add(new Word("gold", "na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this,  words);

        ListView listView = (ListView) findViewById(R.id.number_root_view);
        listView.setAdapter(itemsAdapter);
    }
}