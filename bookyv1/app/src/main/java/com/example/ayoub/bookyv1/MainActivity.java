package com.example.ayoub.bookyv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public  static TextView Resultv;
    Button ScanButton ;
    Button Listb ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resultv = findViewById(R.id.ResultShow) ;
        ScanButton = findViewById(R.id.ScanButton) ;
        Listb = findViewById(R.id.List) ;


        ScanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),  Scanning.class ))  ;
            }
        });

        Listb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),  BookList.class ))  ;
            }
        });


    }

}
