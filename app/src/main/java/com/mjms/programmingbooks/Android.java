package com.mjms.programmingbooks;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class Android extends AppCompatActivity {

    //=======================
    //=======================
    LinearLayout b1,b2,b3,b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

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

                    webview.pdf = "https://drive.google.com/file/d/13GQh_13qIGQuiQ38vAjbPqDRt__Pgnkp/view?usp=share_link";
                    Intent b1 = new Intent(Android.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Android.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1FXT6oshGxLMI7UgOcrB82ctlkxW6wcsC/view?usp=share_link";
                    Intent b2 = new Intent(Android.this, webview.class);
                    startActivity(b2);

                }
                else{
                    Intent nointernet = new Intent(Android.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/15plSxJ4nVZ2cL4cX4ab1VhA7Z7Mx8tFn/view?usp=share_link";
                    Intent b3 = new Intent(Android.this, webview.class);
                    startActivity(b3);

                }
                else{
                    Intent nointernet = new Intent(Android.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1zmg_71Nkq4USodRYiXaAnrEqjGtgXEu7/view?usp=share_link";
                    Intent b4 = new Intent(Android.this, webview.class);
                    startActivity(b4);

                }
                else{
                    Intent nointernet = new Intent(Android.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1vB4Zc6F-HcwIo0uH37M23q6whSa_SnaO/view?usp=share_link";
                    Intent b5 = new Intent(Android.this, webview.class);
                    startActivity(b5);
                }
                else{
                    Intent nointernet = new Intent(Android.this, NoInternet.class);
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

                    webview.pdf = "https://drive.google.com/file/d/1_VeO5-lDSA2wCSRETszW0V6sfs4fCjup/view?usp=share_link";
                    Intent b6 = new Intent(Android.this, webview.class);
                    startActivity(b6);

                }
                else{
                    Intent nointernet = new Intent(Android.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });


    }
}