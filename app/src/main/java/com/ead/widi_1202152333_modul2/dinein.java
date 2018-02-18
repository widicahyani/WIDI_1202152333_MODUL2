package com.ead.widi_1202152333_modul2;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class dinein extends AppCompatActivity {
    Button pp;
    Spinner a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);

        a = (Spinner)findViewById(R.id.spinner);
        pp = (Button)findViewById(R.id.ppes);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this, R.array.meja, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (a != null){
            a.setAdapter(adapter);
        }

    }
    public void pilih (View view){
        a = (Spinner)findViewById(R.id.spinner);
        String nomer = a.getSelectedItem().toString();
        Toast.makeText(this, "The table you have choosen is "+nomer,
                Toast.LENGTH_LONG).show();

        Intent a = new Intent(this, dafmenu.class);
        startActivity(a);
    }
}
