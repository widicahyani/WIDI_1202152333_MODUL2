package com.ead.widi_1202152333_modul2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class List extends BaseAdapter {
    Context context;
    String llist[];
    LayoutInflater inflater;

    public List(Context applicationContext, String[] liist){
        this.context = context;
        this.llist = liist;
        inflater = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount(){
        return llist.length;
    }
    @Override
    public Object getItem(int i){
        return null;
    }
    @Override
    public long getItemId(int i){
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        view = inflater.inflate(R.layout.activity_list, null);
        TextView lt = (TextView) view.findViewById(R.id.tlist);
        lt.setText(llist[i]);
        return view;
    }

}