package com.example.eltawakkal.myapplication.backUp7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.eltawakkal.myapplication.R;

/**
 * Created by Eltawakkal on 6/22/16.
 */
public class Api_With_Custom_ListView extends AppCompatActivity implements View.OnClickListener {

    public static final String JSON_URL = "https://api.github.com/users/mnafian/followers";

    Button btShow;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.api_with_custom_list);

        btShow = (Button)findViewById(R.id.btShow);
        listView = (ListView)findViewById(R.id.list_view_api);

        btShow.setOnClickListener(this);

    }

    private void sendRequest(){
        StringRequest stringRequest = new StringRequest(JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT);
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String json){
        parseJSON pj = new parseJSON(json);
        pj.parseJSON();
        custom_list cl = new custom_list(this, parseJSON.id, parseJSON.name, parseJSON.email);
        listView.setAdapter(cl);
    }


    @Override
    public void onClick(View v) {
        sendRequest();
    }
}
