package com.mjms.programmingbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Rubby extends AppCompatActivity {

    //=======================
    //=======================
    LinearLayout b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubby);

        //==Calling=====
        //==Calling=====
        //==Calling=====

        b1=findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1wFPHIeoOw5LL5bOxkOugufN1Hwth-2dA/view?usp=share_link";
                    Intent b1 = new Intent(Rubby.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Rubby.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1m-KxCHoBtJOU6v8o_tE02MQeUefvKaC7/view?usp=share_link";
                    Intent b2 = new Intent(Rubby.this, webview.class);
                    startActivity(b2);
                }
                else{
                    Intent nointernet = new Intent(Rubby.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1AOSWZ3bzpD_wYocBBtlMMJmxkHr6qzLr/view?usp=share_link";
                    Intent b3 = new Intent(Rubby.this, webview.class);
                    startActivity(b3);
                }
                else{
                    Intent nointernet = new Intent(Rubby.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

    }
}