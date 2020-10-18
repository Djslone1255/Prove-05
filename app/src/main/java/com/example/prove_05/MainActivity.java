package com.example.prove_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String BOOK_MESSAGE = "book";
    public static final String CHAPTER_MESSAGE = "chapter";
    public static final String VERSE_MESSAGE = "MyActivity";
    public static final String TAG = "verse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendScripture(View view) {
        Intent intent = new Intent(this, DisplayScriptureActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String book = editText.getText().toString();
        intent.putExtra(BOOK_MESSAGE, book);
        editText = findViewById(R.id.editTextTextPersonName4);
        String chapter = editText.getText().toString();
        intent.putExtra(CHAPTER_MESSAGE, chapter);
        editText = findViewById(R.id.editTextTextPersonName5);
        String verse = editText.getText().toString();
        intent.putExtra(VERSE_MESSAGE, verse);
        Log.d(TAG, "Creating intent with " + book + ' ' + chapter + ':' + verse);
        startActivity(intent);
    }
}