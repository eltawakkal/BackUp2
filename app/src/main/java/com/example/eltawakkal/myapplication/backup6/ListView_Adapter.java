package com.example.eltawakkal.myapplication.backup6;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Eltawakkal on 6/21/16.
 */
public class ListView_Adapter extends ArrayAdapter<String>{

    public ListView_Adapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

}
