package com.mjms.programmingbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Csharp extends AppCompatActivity {

    //=======================
    //=======================
    LinearLayout b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csharp);

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

                    webview.pdf = "https://drive.google.com/file/d/12UN_dNmJDR3YlJTBlFADnp-7zZa93NVZ/view?usp=share_link";
                    Intent b1 = new Intent(Csharp.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Csharp.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1JztlALzgWPSiYx8leetr-g5HB3zJtVSL/view?usp=share_link";
                    Intent b2 = new Intent(Csharp.this, webview.class);
                    startActivity(b2);
                }
                else{
                    Intent nointernet = new Intent(Csharp.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1i8Q27pzSXNiwM67JyEAFljnkJX3xUMWz/view?usp=share_link";
                    Intent b3 = new Intent(Csharp.this, webview.class);
                    startActivity(b3);
                }
                else{
                    Intent nointernet = new Intent(Csharp.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });


    }
}