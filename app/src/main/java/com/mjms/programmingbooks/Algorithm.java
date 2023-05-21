package com.mjms.programmingbooks;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;



public class Algorithm extends AppCompatActivity {

    LinearLayout b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm);

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

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/12opY_Z3VDn55cVNFtdnGImpgVeCalc5Y/view?usp=sharing";
                    Intent b1 = new Intent(Algorithm.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
                    startActivity(nointernet);
                }

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

                    webview.pdf = "https://drive.google.com/file/d/1CrEmMt2xaNViQS1D3S-O3vZ7sAe5_0m3/view?usp=share_link";
                    Intent b2 = new Intent(Algorithm.this, webview.class);
                    startActivity(b2);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1rk4xAnCoPTT65oBPZ-oPJCSKF-H-lusX/view?usp=share_link";
                    Intent b3 = new Intent(Algorithm.this, webview.class);
                    startActivity(b3);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/12Cnx9hTmxNpwCJtcgB7zxFP_KDM63q7j/view?usp=share_link";
                    Intent b4 = new Intent(Algorithm.this, webview.class);
                    startActivity(b4);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1qf-cKc08XWi9jpDBZHI31g4u0_4SqSHb/view?usp=share_link";
                    Intent b5 = new Intent(Algorithm.this, webview.class);
                    startActivity(b5);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1sd655y6UvXsT89cWYf3Ew1zE23SN_6-4/view?usp=share_link";
                    Intent b6 = new Intent(Algorithm.this, webview.class);
                    startActivity(b6);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/16i8-W-5eoVTJWYfVF-bGl1Wa9zQ6Dsxo/view?usp=share_link";
                    Intent b7 = new Intent(Algorithm.this, webview.class);
                    startActivity(b7);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1bVT7u59maFsAPAHRhESGyh7hT13CeG9G/view?usp=share_link";
                    Intent b8 = new Intent(Algorithm.this, webview.class);
                    startActivity(b8);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1VeJ9-rfHTn4haX4d08LQEF56XCbZKzWH/view?usp=share_link";
                    Intent b9 = new Intent(Algorithm.this, webview.class);
                    startActivity(b9);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1_oI2_yT847c7PDQpjmuc4Wl0nXYPsLBy/view?usp=share_link";
                    Intent b10 = new Intent(Algorithm.this, webview.class);
                    startActivity(b10);
                }
                else{
                    Intent nointernet = new Intent(Algorithm.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });

    }
}