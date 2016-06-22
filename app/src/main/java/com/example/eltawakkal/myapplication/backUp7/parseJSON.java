package com.example.eltawakkal.myapplication.backUp7;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Eltawakkal on 6/22/16.
 */
public class parseJSON {

    public static String[] id;
    public static String[] name;
    public static String[] email;

    public static final String KEY_ID = "login";
    public static final String KEY_NAME = "id";
    public static final String KEY_EMAIL = "url";

    private JSONArray user = null;
    private String json;

    public parseJSON(String json) {
        this.json = json;
    }

    protected void parseJSON() {
        JSONObject jsonObject = null;
        try {
            user = new JSONArray(json);

            id = new String[user.length()];
            name = new String[user.length()];
            email = new String[user.length()];

            for (int i = 0; i < user.length(); i++) {
                JSONObject jo = user.getJSONObject(i);
                id[i] = jo.getString(KEY_ID);
                name[i] = jo.getString(KEY_NAME);
                email[i] = jo.getString(KEY_EMAIL);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
