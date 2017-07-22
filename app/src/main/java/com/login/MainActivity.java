package com.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mTextuser;
    EditText mTextpassword;
    GridView gridView;
    int animals[] = {R.drawable.animal1,R.drawable.animal3,R.drawable.animal4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*gridView = (GridView) findViewById(R.id.gridView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), animals);
        gridView.setAdapter(customAdapter);*/
        mTextuser = (EditText)findViewById(R.id.textuser);
        mTextpassword = (EditText)findViewById(R.id.textpassword);


        Button btnlogin = (Button)findViewById(R.id.btnlogin);


        btnlogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (mTextuser.getText().toString().equals("")) {
            mTextuser.setError("Enter the user name");
            return;
        }

        if(mTextpassword.getText().toString().equals("")){
            mTextpassword.setError("Enter the Password");
            return;

        }

        Intent intent = new Intent(MainActivity.this, Login.class);

        intent.putExtra("name",mTextuser.getText().toString());
        startActivity(intent);

    }
}
