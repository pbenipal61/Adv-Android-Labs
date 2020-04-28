package com.postmaninteractive.adv_android_labs.Lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.postmaninteractive.adv_android_labs.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Lab4_2 extends AppCompatActivity {

    private ListView listView;
    private final String URL = "https://financialmodelingprep.com/api/company/price/AAPL,NOK,GOOGL,FB,RHT,INTL?datatype=json";
    private static final String TAG = "Lab4_2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_2);
        listView = (ListView) findViewById(R.id.listView);

        RequestQueue queue = Volley.newRequestQueue(this);
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                final ArrayList<String> prices = new ArrayList<String>();
                prices.add("Apple: " + getValueForKey("AAPL", response) + " USD");
                prices.add("Alphabet (Google): " + getValueForKey("GOOGL", response) + " USD");
                prices.add("Facebook: " + getValueForKey("FB", response) + " USD");
                prices.add("Nokia: " + getValueForKey("NOK", response) + " USD");
                prices.add("Red Hat: " + getValueForKey("RHT", response) + " USD");
                prices.add("INTEL: " + getValueForKey("INTL", response) + " USD");

                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, prices);
                listView.setAdapter(adapter);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(request);

    }

    private String getValueForKey(String key, JSONObject object){

        String response = "";
        try {
            response = String.valueOf(object.getJSONObject(key).getDouble("price"));
        } catch (JSONException e) {
            e.printStackTrace();
            response = "";
        }
        return response;
    }
};

