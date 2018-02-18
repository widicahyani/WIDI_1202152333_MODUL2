package com.ead.widi_1202152333_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class mainmenu extends AppCompatActivity {
    private RadioGroup rgrup;
    private RadioButton opsia, opsib;
    private Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);


        rgrup = (RadioGroup) findViewById(R.id.rg);
        opsia = (RadioButton) findViewById(R.id.di);
        opsib = (RadioButton) findViewById(R.id.ta);
        pesan = (Button) findViewById(R.id.ps);


        }

    public void ppesanan (View view){
        int terpilih = rgrup.getCheckedRadioButtonId();

        opsia = (RadioButton) findViewById(R.id.di);
        opsib = (RadioButton) findViewById(R.id.ta);

        if (terpilih == opsia.getId()){
            Intent a = new Intent(this, dinein.class);
            startActivity(a);
        }
        else {
            Intent a = new Intent(this, take.class);
            startActivity(a);
        }

    }
}
