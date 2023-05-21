package com.mjms.programmingbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;



public class Interview extends AppCompatActivity {

    //=======================
    //=======================
    LinearLayout b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);

        //==Ad==/
        //==Ad==/

        //==Ad==//
        //==Ad==//

        //==Calling=====
        //==Calling=====
        //==Calling=====

        b1=findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ////////////////////////////
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){

                    webview.pdf = "https://drive.google.com/file/d/1KhgGBH8qxLD3piozN556XUJfwCMIlVg1/view?usp=sharing";
                    Intent b1 = new Intent(Interview.this, webview.class);
                    startActivity(b1);
                }
                else{
                    Intent nointernet = new Intent(Interview.this, NoInternet.class);
                    startActivity(nointernet);
                }
                //////////////////////////////////////

            }
        });



    }
}
