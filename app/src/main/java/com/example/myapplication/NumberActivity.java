package com.example.myapplication;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo'e", R.drawable.number_nine));
        words.add(new Word("ten", "na'aacha", R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this,  words);

        ListView listView = (ListView) findViewById(R.id.number_root_view);
        listView.setAdapter(itemsAdapter);

//        LinearLayout numberRootView = (LinearLayout) findViewById(R.id.number_root_view);
//
////        managing memory usage
//        int index = 0;
//        while (index < words.size()){
////            numberRootView.addView(new TextView(this).setText(words.get(index)));
//            TextView placer = new TextView(this);
//            placer.setText(words.get(index));
//            placer.setPadding(6,12,6,12);
//            placer.setBackgroundColor(Color.TRANSPARENT);
//            placer.setTextColor(Color.BLACK);
//            placer.setTextSize(30);
//            numberRootView.addView(placer);
//            ++index;
//        }
    }
}