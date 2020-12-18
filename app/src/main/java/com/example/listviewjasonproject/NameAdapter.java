package com.example.listviewjasonproject;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NameAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] RepoName;
    private final String[] OwnerName;

    public NameAdapter(Activity context, String[] name, String[] fullname) {
        super(context, R.layout.list_item, name);

        this.context=context;
        this.RepoName=name;
        this.OwnerName=fullname;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listview=inflater.inflate(R.layout.list_item, null,true);

        TextView nameText = (TextView) listview.findViewById(R.id.name);
        TextView fullNameText = (TextView) listview.findViewById(R.id.fullname);
        nameText.setText(RepoName[position]);
        fullNameText.setText(OwnerName[position]);

        return listview;

    };
}

