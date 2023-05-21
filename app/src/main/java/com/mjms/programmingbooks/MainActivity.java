package com.mjms.programmingbooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class MainActivity extends AppCompatActivity {

    FirebaseRemoteConfig remoteConfig;

    LinearLayout algo, andro, ard, back, c, cp, csh, cms,data, front, java, javas, linux, matl, more, ms, python, rasp, ruby, swift, ios, creak, splash;
    Animation fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Firebase App Update Code
        //Firebase App Update Code
        int currentVersionCode;

        currentVersionCode = getCurrentVersionCode();
        Log.d("myApp",String.valueOf(currentVersionCode));

        remoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(2)
                .build();
        remoteConfig.setConfigSettingsAsync(configSettings);
        remoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener<Boolean>() {
            @Override
            public void onComplete(@NonNull Task<Boolean> task) {
                if (task.isSuccessful()){
                    final String newVersionCode = remoteConfig.getString("newVersionCode");
                    if (Integer.parseInt(newVersionCode) > getCurrentVersionCode()){
                        showUpdateDialogBox();

                    }
                }
            }
        });
        //Firebase App Update Code
        //Firebase App Update Code


        //==Ad==/
        //==Ad==/


        //==Ad==//
        //==Ad==//


        //=== Calling======
        //=== Calling======

        algo = findViewById(R.id.algo);
        andro = findViewById(R.id.andro);
        ard = findViewById(R.id.ard);
        back = findViewById(R.id.back);
        c = findViewById(R.id.c);
        cp = findViewById(R.id.cp);
        csh = findViewById(R.id.csh);
        cms = findViewById(R.id.cms);
        data = findViewById(R.id.data);
        front = findViewById(R.id.front);
        java = findViewById(R.id.java);
        javas = findViewById(R.id.javas);
        linux = findViewById(R.id.linux);
        matl = findViewById(R.id.matl);
        more = findViewById(R.id.more);
        ms = findViewById(R.id.ms);
        python = findViewById(R.id.python);
        rasp = findViewById(R.id.rasp);
        ruby = findViewById(R.id.ruby);
        swift = findViewById(R.id.swift);
        ios = findViewById(R.id.ios);
        creak = findViewById(R.id.creak);


        //====================================
        //====================================

        //====SPLASH====//

        splash = findViewById(R.id.splash);
        fadeout = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fadeout);
        splash.setVisibility(View.VISIBLE);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                splash.startAnimation(fadeout);

                //===================
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        splash.setVisibility(View.GONE);

                    }
                },1000);
                //=============

            }
        }, 3000);



        //====SPLASH====//

        //====================================

        //====Algorithm button============
        //====Algorithm button============

        algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent algo = new Intent(MainActivity.this, Algorithm.class);
                    startActivity(algo);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }
            }
        });

        //====Android button============
        //====Android button============

        andro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent andro = new Intent(MainActivity.this, Android.class);
                    startActivity(andro);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====Arduino button============
        //====Arduino button============

        ard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Arduino.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====Backend button============
        //====Backend button============

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Backend.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });


        //====C button============
        //====C button============

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, C.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====C++ button============
        //====C++ button============

        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Cplus.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====C# button============
        //====C# button============

        csh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Csharp.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====CMS button============
        //====CMS button============

        cms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, CMS.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });


        //====database button============
        //====database button============

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Database.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====Frontend button============
        //====Frontend button============

        front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Frontend.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====Java button============
        //====Java button============

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Java.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====Javascript button============
        //====Javascript button============

        javas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Javascript.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====Linux button============
        //====Linux button============

        linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Linux.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }


            }
        });

        //====Matlab button============
        //====Matlab button============

        matl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Matlab.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====More button============
        //====More button============

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, More.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }
            }
        });

        //====Ms office button============
        //====Ms office button============

        ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Msoffice.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });


        //==== python utton============
        //==== python utton============

        //==Interstitial ads==//

        //==End Interstitial ads==//

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Python.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====respberry pi button============
        //====respberry pi button============

        rasp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Respberrypi.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====ruby button============
        //====ruby button============

        ruby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //==Interstitial ads==//

                //==End Interstitial ads==//

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Rubby.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });

        //====Swift button============
        //====Swift button============

        //==Interstitial ads==//

        //==End Interstitial ads==//

        swift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Swift.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }

            }
        });


        //====ios button============
        //====ios button============

        //==Interstitial ads==//

        //==End Interstitial ads==//

        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Ios.class);
                    startActivity(ard);
                }
                else {
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }
            }
        });

        //====interview button============
        //====interview button============

        //==Interstitial ads==//

        //==End Interstitial ads==//

        creak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    Intent ard = new Intent(MainActivity.this, Interview.class);
                    startActivity(ard);
                }
                else{
                    Intent nointernet = new Intent(MainActivity.this, NoInternet.class);
                    startActivity(nointernet);
                }
            }
        });





    }

    //===========Menu=============//
    //===========Menu=============//

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {



        if(item.getItemId()==R.id.set_id2){

            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject = "Programming Book";
            String body = "This app is very useful to learn Programming. \n com.mjms.programmingbooks";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent, "Share with"));
            return true;
        }

        if(item.getItemId()==R.id.set_id3){
            Webview2.website = "https://play.google.com/";
            Intent b1 = new Intent(MainActivity.this, Webview2.class);
            startActivity(b1);
            return true;
        }
        if(item.getItemId()==R.id.set_id4){
            Webview2.website = "https://sites.google.com/view/mjmstech-programmingbook/";
            Intent b1 = new Intent(MainActivity.this, Webview2.class);
            startActivity(b1);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Firebase App Update Code
    //Firebase App Update Code
    private int getCurrentVersionCode(){
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(),0);
        }catch (Exception e){
            Log.d("myApp",e.getMessage());
        }
        return  packageInfo.versionCode;
    }
    private void showUpdateDialogBox() {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setIcon(R.drawable.splash)
                .setTitle(getString(R.string.new_update))
                .setMessage(getString(R.string.new_update_text))
                .setCancelable(false)
                .setPositiveButton(Html.fromHtml("<h4 width:200px style=\"background-color:rgb(57, 233, 145);\" > Update Now </h4>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.playStoreLink))));
                        }catch (Exception e){
                            Toast.makeText(MainActivity.this, "Something Wrong ! Please try again...", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .setNegativeButton(Html.fromHtml("<h4 width:200px style=\"background-color:rgb(57, 233, 145);\" > Not Now </h4>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       dialogInterface.dismiss();
                    }
                })
                .show();

    }

    //Firebase App Update Code
    //Firebase App Update Code

}