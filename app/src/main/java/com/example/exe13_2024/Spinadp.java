package com.example.exe13_2024;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Spinadp extends BaseAdapter {
    private Context context;
    private int[] flags;
    private String[] names;
    private String[] caps;
    private LayoutInflater inflater;

    public Spinadp(Context context, int[] flags, String[] names, String[] caps){
        this.context = context;
        this.flags = flags;
        this.names = names;
        this.caps = caps;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return names.length;
    }


    @Override
    public Object getItem(int i) {
        return names[i];
    }


    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.custom_spin_line, parent, false);
        ImageView flg = view.findViewById(R.id.flg);
        TextView countname = view.findViewById(R.id.countname);
        TextView cap = view.findViewById(R.id.cap);
        flg.setImageResource(flags[i]);
        countname.setText(names[i]);
        cap.setText(caps[i]);
        return view;
    }
}
