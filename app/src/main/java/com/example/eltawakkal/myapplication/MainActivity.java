package com.example.eltawakkal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eltawakkal.myapplication.backUp7.Api_With_Custom_ListView;
import com.example.eltawakkal.myapplication.backup6.ListView_Class;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mText;
    private String alamat;
    private ImageView imageView;
    ImageView btAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.btChange);
        mText = (TextView)findViewById(R.id.txAlamat);
        imageView = (ImageView)findViewById(R.id.imgLogo);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText.setText(getAlamat());
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListView_Class.class);
                startActivity(intent);
            }
        });

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                startActivity(new Intent(MainActivity.this, Api_With_Custom_ListView.class));
                return true;
            }
        });

    }

    public String getAlamat(){
        alamat = "Jl. Brawijaya No 98 B, kota Malang";
        return alamat;
    }

}
