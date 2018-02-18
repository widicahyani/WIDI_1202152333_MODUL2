package com.ead.widi_1202152333_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class take extends AppCompatActivity {
EditText a, b, c, d;
Button pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take);

        a = (EditText)findViewById(R.id.nama);
        b = (EditText)findViewById(R.id.phone);
        c = (EditText)findViewById(R.id.address);
        d = (EditText)findViewById(R.id.notes);
        pilih = (Button)findViewById(R.id.ppes);
    }
    public void pesanan (View view){
        Intent a = new Intent(this, dafmenu.class);
        startActivity(a);
    }
}
