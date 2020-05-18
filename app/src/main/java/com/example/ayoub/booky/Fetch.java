package com.example.ayoub.booky;

import android.os.AsyncTask;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Fetch extends AsyncTask<Void , Void, Void>  {
    private static String ISBN;
    String data ;

    public static void setISBN(String isbn) {
        ISBN=isbn ;
    }

    public static void getISBN(String isbn) {
        ISBN=isbn ;
    }



    @Override
    protected Void doInBackground(Void... voids) {
getISBN(ISBN);
String X = "https://www.googleapis.com/books/v1/volumes?" + ISBN ;
        try {

            URL   url  = new URL("https://www.googleapis.com/books/v1/volumes?") ;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream() ;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream)) ;
            String line ="" ;
            while (line!=null){
                line = bufferedReader.readLine();
                data = data+ line ;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
