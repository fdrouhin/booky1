package com.example.ayoub.booky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* dans cette activité , on va indiquer a l'utilisateur si le livre existe ou non , puis quand il appuie sur add le numero isbn se concaténe avec l'url de base
en appelant la classe Fetch qui va s'appliquer en backgroud  /*
 */

    public class WannaAdd extends AppCompatActivity {
        public String isbn ;
        public  static TextView Resultv;
        private static final String TAG =WannaAdd.class.getSimpleName() ;
        Button add ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_wanna_add);
            Resultv = findViewById(R.id.ResultShow) ;
            add = findViewById(R.id.Add) ;

            Bundle bundle = getIntent().getExtras();
            isbn =bundle.getString("isbn") ;
            Resultv.setText(isbn);
            Fetch.setISBN(isbn) ;



            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                }
            });

        }



    public void searchBook(View view) {

        Log.i(TAG,"SearcheBook"+isbn) ;
    }
}
