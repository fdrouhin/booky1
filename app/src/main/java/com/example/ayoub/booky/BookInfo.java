package com.example.ayoub.booky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class BookInfo extends AppCompatActivity {


    private static final String  TAG = BookInfo.class.getSimpleName() ;
    EditText BookTitle ;
    EditText Author;
    EditText ReleaseDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_info);

        BookTitle = findViewById(R.id.BookTitle) ;
        Author = findViewById(R.id.Author) ;
        ReleaseDate= findViewById(R.id.ReleaseDate) ;

    }






}
