package com.mjms.programmingbooks;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Arduino extends AppCompatActivity {

    LinearLayout b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arduino);

        //==Calling=====
        //==Calling=====
        //==Calling=====

        b1=findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1y4TRviekGV-ZHHS-LEJE2ywDo36186OG/view?usp=share_link";
                    Intent b1 = new Intent(Arduino.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Arduino.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1Z2JwTneH-KMiuVvpJYquQQer9fwFWMZW/view?usp=share_link";
                    Intent b2 = new Intent(Arduino.this, webview.class);
                    startActivity(b2);
                }
                else{
                    Intent nointernet = new Intent(Arduino.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1KT8NSG9ldg1Dzj9PmrtDHiTJLdMFcLFn/view?usp=share_link";
                    Intent b3 = new Intent(Arduino.this, webview.class);
                    startActivity(b3);
                }
                else{
                    Intent nointernet = new Intent(Arduino.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1jQ3wBcNnpmaVkcsQII250Czr4t5GSRSb/view?usp=share_link";
                    Intent b4 = new Intent(Arduino.this, webview.class);
                    startActivity(b4);
                }
                else{
                    Intent nointernet = new Intent(Arduino.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1GTFRQCWGZJlHuAa3_OqZwC7gZ9MMEyhv/view?usp=share_link";
                    Intent b5 = new Intent(Arduino.this, webview.class);
                    startActivity(b5);
                }
                else{
                    Intent nointernet = new Intent(Arduino.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1nzHcEeaWKC4Lo4DU_DWwBMJPYeHFaVCa/view?usp=share_link";
                    Intent b6 = new Intent(Arduino.this, webview.class);
                    startActivity(b6);
                }
                else{
                    Intent nointernet = new Intent(Arduino.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });


    }
}

