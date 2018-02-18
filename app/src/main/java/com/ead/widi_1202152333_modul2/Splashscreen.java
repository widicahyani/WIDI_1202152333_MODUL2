package com.ead.widi_1202152333_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class Splashscreen extends AppCompatActivity {

    private static int splashInterval = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pertama = new Intent(Splashscreen.this, mainmenu.class );
                startActivity(pertama);

                Toast.makeText(Splashscreen.this, "WIDI CAHYANI_1202152333",
                        Toast.LENGTH_LONG).show();
                this.finish();
            }

            private void finish(){
            } }, splashInterval);
    };
    }

