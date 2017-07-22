package com.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class Login extends AppCompatActivity {

    ListView list;
    List<Enemy> eList = new ArrayList<>();
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enimies_list);
        list = (ListView) findViewById(R.id.enemyName);
        customAdapter = new CustomAdapter(getApplicationContext(), eList);
        list.setAdapter(customAdapter);


        //list.setAdapter(aa);
        /*LoginList loginsuccess = new LoginList();
        loginsuccess.execute();*/
        RestGet restGet = new RestGet(new OnHttpResponseListener() {
            @Override
            public void onResponseCallback(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                   // System.out.println(jsonObject);

                    JSONArray enemies = jsonObject.getJSONArray("enemies");

                    for (int i =0; i<enemies.length();i++){

                        Enemy enemy = new Enemy();
                        JSONObject obj = enemies.getJSONObject(i);
                        enemy.setName(obj.getString("name"));
                        enemy.setDamage_high_range(obj.getString("damage_high_range"));
                        eList.add(enemy);

                    }
                    customAdapter.notifyDataSetChanged();

                    System.out.print(eList);

                }
                catch (JSONException e){

                }
            }
        });
    }

}
