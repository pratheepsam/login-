package com.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mTextuser;
    EditText mTextpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
