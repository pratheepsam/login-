package com.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sysadmin on 21/7/17.
 */

public class CustomAdapter extends BaseAdapter {
    TextView text;
    Context context;
    List<Enemy> eList;
    LayoutInflater inflater;
    public CustomAdapter(Context applicationContext,List<Enemy> eList) {

        this.context = applicationContext;
        this.eList = eList;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return eList.size();
    }

    @Override
    public Enemy getItem(int i) {
        return eList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.item_enemy,null);
        Enemy enemy = eList.get(i);

        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(enemy.getName());
        TextView damagehigh = (TextView) view.findViewById(R.id.damageHigh);
        damagehigh.setText(enemy.getDamage_high_range());
        return view;
    }
}
