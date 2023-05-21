package com.mjms.programmingbooks;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;



public class Backend extends AppCompatActivity {

    //=======================
    //=======================
    LinearLayout b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backend);

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
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        b16 = findViewById(R.id.b16);
        b17 = findViewById(R.id.b17);
        b18 = findViewById(R.id.b18);
        b19 = findViewById(R.id.b19);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);


        //============================

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1f0NjskeIS6gsJJ_zZdZfsjIMJOSr4lhx/view?usp=share_link";
                    Intent b1 = new Intent(Backend.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/19x3q2rY7spkyLdKPi1y8OKKxiwk1O2Wm/view?usp=share_link";
                    Intent b2 = new Intent(Backend.this, webview.class);
                    startActivity(b2);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/16mSRpDuyLmgIl8gExEfpEiAN_zjkPDix/view?usp=share_link";
                    Intent b3 = new Intent(Backend.this, webview.class);
                    startActivity(b3);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1RkbOdMEXugj0VS0X2jR1uR9InJ7Db35C/view?usp=share_link";
                    Intent b4 = new Intent(Backend.this, webview.class);
                    startActivity(b4);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1x61vvQNZwnXfCMxBnMcjQ7XzfC-SfCu1/view?usp=share_link";
                    Intent b5 = new Intent(Backend.this, webview.class);
                    startActivity(b5);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1udi7TlHVaYYz5QMeja-bTGe3EIK2rxp8/view?usp=share_link";
                    Intent b6 = new Intent(Backend.this, webview.class);
                    startActivity(b6);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1f0NjskeIS6gsJJ_zZdZfsjIMJOSr4lhx/view?usp=share_link";
                    Intent b1 = new Intent(Backend.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

                webview.pdf = "https://drive.google.com/file/d/19vv4tllaAH0ExxqW_Jo_-TFCEg7vyIAi/view?usp=share_link";
                Intent b7 = new Intent(Backend.this, webview.class);
                startActivity(b7);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1f0NjskeIS6gsJJ_zZdZfsjIMJOSr4lhx/view?usp=share_link";
                    Intent b1 = new Intent(Backend.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

                webview.pdf = "https://drive.google.com/file/d/1mulLqhi9MVr_tB8pbv417ZZJEVNZ53aC/view?usp=share_link";
                Intent b8 = new Intent(Backend.this, webview.class);
                startActivity(b8);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1wGHuZnb3kXNjupBD2OjucyERvlcxc-IP/view?usp=share_link";
                    Intent b9 = new Intent(Backend.this, webview.class);
                    startActivity(b9);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1E45iEk21Z4p1gSnXUbLDUEIGwIw6DSoD/view?usp=share_link";
                    Intent b10 = new Intent(Backend.this, webview.class);
                    startActivity(b10);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

                webview.pdf = "https://drive.google.com/file/d/1E45iEk21Z4p1gSnXUbLDUEIGwIw6DSoD/view?usp=share_link";
                Intent b10 = new Intent(Backend.this, webview.class);
                startActivity(b10);
            }
        });

        //======================

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1GAoMoiFyKFn5QWc4l97n5L1mJUnSgvWX/view?usp=share_link";
                    Intent b1 = new Intent(Backend.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1nyOr4ljw7hfF6gjgxjksSbWfHt08gFbS/view?usp=share_link";
                    Intent b2 = new Intent(Backend.this, webview.class);
                    startActivity(b2);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////


            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1fLvATHFn7cvfJor__o1MGjOY2SJAaGfZ/view?usp=share_link";
                    Intent b3 = new Intent(Backend.this, webview.class);
                    startActivity(b3);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1nvdPus3wFZcaJK2c19yHGDF30cqlTJTA/view?usp=share_link";
                    Intent b4 = new Intent(Backend.this, webview.class);
                    startActivity(b4);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1Y0svzyM2occhBqJe4-i9aOqcdnYRWzzh/view?usp=share_link";
                    Intent b5 = new Intent(Backend.this, webview.class);
                    startActivity(b5);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1eST26fz0cIwI2n3WtT9cxqwCQniuDjSc/view?usp=share_link";
                    Intent b6 = new Intent(Backend.this, webview.class);
                    startActivity(b6);

                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1oQrPU0ZuM4FMrF8QXeqIVuu9yfnpasPX/view?usp=share_link";
                    Intent b7 = new Intent(Backend.this, webview.class);
                    startActivity(b7);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1XbgBqI2EjYSB7FH6KwSuRzi4dNkx34KR/view?usp=share_link";
                    Intent b8 = new Intent(Backend.this, webview.class);
                    startActivity(b8);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/10hXeKZrGm1mfGA17-2u2RwVdw7a41ff9/view?usp=share_link";
                    Intent b9 = new Intent(Backend.this, webview.class);
                    startActivity(b9);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1Hb8HP13ZEO9J7LpTtO1BHJ05hhHihrpZ/view?usp=share_link";
                    Intent b10 = new Intent(Backend.this, webview.class);
                    startActivity(b10);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        //===========================

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1WCYqBvSO_BY0Rm8QloCyC2i_NYX8u4VO/view?usp=share_link";
                    Intent b1 = new Intent(Backend.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1_yXhGcuTH1ntySfGB2T7uKwQ-PIkWJAQ/view?usp=share_link";
                    Intent b22 = new Intent(Backend.this, webview.class);
                    startActivity(b22);
                }
                else{
                    Intent nointernet = new Intent(Backend.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });


    }
}
