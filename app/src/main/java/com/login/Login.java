package com.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class Login extends AppCompatActivity {
    TextView  text;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        text = (TextView) findViewById(R.id.viewuser);
        list = (ListView) findViewById(R.id.list_view);
        List<String> todoItems = new ArrayList<>();
        todoItems.add("Sathish");
        todoItems.add("Pradeep");
        todoItems.add("Bharath");

        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,todoItems);
        list.setAdapter(aa);
        /*LoginList loginsuccess = new LoginList();
        loginsuccess.execute();*/
        RestGet restGet = new RestGet(new OnHttpResponseListener() {
            @Override
            public void onResponseCallback(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String location = jsonObject.getString("location");
                    text.setText(location);

                }
                catch (JSONException e){

                }
            }
        });
    }

}
