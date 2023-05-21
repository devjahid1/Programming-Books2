package com.mjms.programmingbooks;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import android.view.View;
import android.widget.LinearLayout;


public class Database extends AppCompatActivity {

    //=======================
    //=======================
    LinearLayout b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        //==Ad==/
        //==Ad==/


        //==Ad==//
        //==Ad==//

        //==Calling=====
        //==Calling=====
        //==Calling=====

        b1=findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1D2qP8ed6FSx9dIkOfEaFvmUNiDE8b0X3/view?usp=share_link";
                    Intent b2 = new Intent(Database.this, webview.class);
                    startActivity(b2);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/16CgpBF8RnqsW7mcnyUngKEkHZUoOvC4M/view?usp=share_link";
                    Intent b2 = new Intent(Database.this, webview.class);
                    startActivity(b2);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1k3JQv7rD-V58u4gnLkd0U48tod568TYi/view?usp=share_link";
                    Intent b3 = new Intent(Database.this, webview.class);
                    startActivity(b3);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1vYWX71bkTWrxdWikstP1fr9G3wvDVXoG/view?usp=share_link";
                    Intent b4 = new Intent(Database.this, webview.class);
                    startActivity(b4);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1_QWTjXAKIa6JnROQVKxuZKx46C0m4tcg/view?usp=share_link";
                    Intent b5 = new Intent(Database.this, webview.class);
                    startActivity(b5);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1iq4Xh3q2XNGVxbUpzc-IrRHsV4h0fy1D/view?usp=share_link";
                    Intent b6 = new Intent(Database.this, webview.class);
                    startActivity(b6);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1i50eTWqbs5MaUT26oNn1Ttr19zZQcrp4/view?usp=share_link";
                    Intent b7 = new Intent(Database.this, webview.class);
                    startActivity(b7);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1cMrVwMJn401Lp-j3O1FkKSc0LjLssrjU/view?usp=share_link";
                    Intent b8 = new Intent(Database.this, webview.class);
                    startActivity(b8);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1KwgvQqRckBTKD1mSfF-vRhhhCwZvqPTU/view?usp=share_link";
                    Intent b9 = new Intent(Database.this, webview.class);
                    startActivity(b9);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1SdWSyOBsfqKJzfGEzVhC09Q5urbNS-yv/view?usp=share_link";
                    Intent b10 = new Intent(Database.this, webview.class);
                    startActivity(b10);
                }
                else{
                    Intent nointernet = new Intent(Database.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });


    }
}