package com.example.eltawakkal.myapplication.backup6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.eltawakkal.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eltawakkal on 6/21/16.
 */
public class ListView_Class extends AppCompatActivity {

    ListView listView;
    ImageButton btAdd;
    EditText tvAdd;
    ListView_Adapter listView_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        listView = (ListView)findViewById(R.id.list_item);
        btAdd = (ImageButton) findViewById(R.id.btAdd);
        tvAdd = (EditText)findViewById(R.id.tvAdd);

        final List<String> names = new ArrayList<String>();

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                names.add(tvAdd.getText().toString());
                listView_adapter = new ListView_Adapter(getApplicationContext(), android.R.layout.simple_list_item_1, names);
                listView.setAdapter(listView_adapter);
            }
        });
    }
}
