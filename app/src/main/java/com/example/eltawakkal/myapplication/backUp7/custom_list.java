package com.example.eltawakkal.myapplication.backUp7;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.eltawakkal.myapplication.R;

/**
 * Created by Eltawakkal on 6/22/16.
 */
public class custom_list extends ArrayAdapter<String>{

    private String[] id;
    private String[] name;
    private String[] email;
    private Activity context;

    public custom_list (Activity context, String[] id, String[] name, String[] email){
        super(context, R.layout.listview_layout, id);
        this.context = context;
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.listview_layout, null, true);

        TextView tvID = (TextView)listViewItem.findViewById(R.id.tvID);
        TextView tvName = (TextView)listViewItem.findViewById(R.id.tvName);
        TextView tvEmail = (TextView)listViewItem.findViewById(R.id.tvEmail);

        tvID.setText(id[position]);
        tvName.setText(name[position]);
        tvEmail.setText(email[position]);

        return listViewItem;
    }
}
