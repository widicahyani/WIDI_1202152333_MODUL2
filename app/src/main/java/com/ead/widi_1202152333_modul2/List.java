package com.ead.widi_1202152333_modul2;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class List extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String[] harga;

    public List(Activity context, String[] itemname, Integer[] imgid ,String[] harga) {
        super(context, R.layout.activity_list, itemname);
        // TODO Auto-generated constructor stub
        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.harga=harga;
    }
    public View getView (int position,View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_list, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.menu);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.gambar);
        TextView extratxt = (TextView) rowView.findViewById(R.id.harga);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Harga: Rp "+harga[position]);
        return rowView;
    };

}