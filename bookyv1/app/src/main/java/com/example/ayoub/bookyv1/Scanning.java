package com.example.ayoub.bookyv1;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Scanning extends AppCompatActivity implements ZXingScannerView.ResultHandler{


    int MY_PERMISSIONS_REQUEST_CAMERA = 0;

    String isbn ;

    ZXingScannerView Scanv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Scanv = new ZXingScannerView(this) ;
        setContentView(Scanv);

    }





    @Override
    public void handleResult(Result result) {
        MainActivity.Resultv.setText(result.getText());
        isbn=result.getText() ;
        onBackPressed();


    }


    @Override
    protected void onPause() {
        super.onPause();
        Scanv.stopCamera();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Scanv.setResultHandler(this);
        Scanv.startCamera();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA},MY_PERMISSIONS_REQUEST_CAMERA);
        }
        Scanv.setResultHandler(this);
        Scanv.startCamera();

    }
}