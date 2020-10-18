package com.example.prove_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayScriptureActivity extends AppCompatActivity {
    public static final String TAG = "verse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);

        Intent intent = getIntent();
        String book = intent.getStringExtra(MainActivity.BOOK_MESSAGE);
        String chapter = intent.getStringExtra(MainActivity.CHAPTER_MESSAGE);
        String verse = intent.getStringExtra(MainActivity.VERSE_MESSAGE);
        String scripture = book + ' ' + chapter + ':' + verse;
        Log.d(TAG, "Recived intent with " + scripture);
        TextView textView = findViewById(R.id.Scripture_text);
        textView.setText(scripture);

    }
}