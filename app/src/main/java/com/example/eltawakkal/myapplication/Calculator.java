package com.example.eltawakkal.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private EditText txN1, txN2;
    private TextView tvHasil;
    private Button btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txN1 = (EditText) findViewById(R.id.txN1);
        txN2 = (EditText)findViewById(R.id.txN2);
        tvHasil = (TextView)findViewById(R.id.txHasil);
        btHitung = (Button)findViewById(R.id.btHitung);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i, j, hasil;
                i = Integer.parseInt(txN1.getText().toString());
                j = Integer.parseInt(txN2.getText().toString());
                hasil = i+j;
                tvHasil.setText("" + hasil);
            }
        });

    }
}
