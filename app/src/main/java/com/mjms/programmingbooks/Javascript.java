package com.mjms.programmingbooks;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import android.view.View;
import android.widget.LinearLayout;



public class Javascript extends AppCompatActivity {

    //=======================
    //=======================
    LinearLayout b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript);

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

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1qKohKQ8jGTbMOioMYwaUmLvdrDb3UawM/view?usp=share_link";
                    Intent b1 = new Intent(Javascript.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Javascript.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1U_YecJk7tszkNp-9UbJqsMaYCZlmEnc4/view?usp=share_link";
                    Intent b2 = new Intent(Javascript.this, webview.class);
                    startActivity(b2);
                }
                else{
                    Intent nointernet = new Intent(Javascript.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1eSwXW_19AdOZB6buAQUU0e5oqJeqfSwe/view?usp=share_link";
                    Intent b3 = new Intent(Javascript.this, webview.class);
                    startActivity(b3);
                }
                else{
                    Intent nointernet = new Intent(Javascript.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1B2E9SeAGGh-iLPepcL9mcfWRqOp1on1P/view?usp=share_link";
                    Intent b4 = new Intent(Javascript.this, webview.class);
                    startActivity(b4);
                }
                else{
                    Intent nointernet = new Intent(Javascript.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1G72Y1X-fppmJ7U1HgrFyDOxeQPEYkQjS/view?usp=share_link";
                    Intent b5 = new Intent(Javascript.this, webview.class);
                    startActivity(b5);
                }
                else{
                    Intent nointernet = new Intent(Javascript.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1qJRfEJLJYezCfkECCF3sWsECllr7g6lT/view?usp=share_link";
                    Intent b6 = new Intent(Javascript.this, webview.class);
                    startActivity(b6);
                }
                else{
                    Intent nointernet = new Intent(Javascript.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });


    }
}