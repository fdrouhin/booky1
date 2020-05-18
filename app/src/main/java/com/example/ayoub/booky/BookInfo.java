package com.example.ayoub.booky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class BookInfo extends AppCompatActivity {


    private static final String  TAG = BookInfo.class.getSimpleName() ;
    private EditText bookTitle ;
    private EditText author;
    private EditText releaseDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_info);

        bookTitle = findViewById(R.id.BookTitle) ;
        author = findViewById(R.id.Author) ;
        releaseDate= findViewById(R.id.ReleaseDate) ;

    }






}
