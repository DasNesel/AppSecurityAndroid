package com.example.secu_app;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class Affichpasswd extends AppCompatActivity implements View.OnClickListener {
    private EditText mLoginEditText;
    private EditText mPasswordEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        mLoginEditText =(EditText) findViewById(R.id.ACCOUNT_NAME);
        mPasswordEditText=(EditText) findViewById(R.id.PASSWORD);


        final String login= PreferenceUtils.getLogin();
        if(!TextUtils.isEmpty(login)){
            startActivity(getHomeIntent(login));
        }
    }

    @Override
    public void onClick(View v){
        String login;
        if(TextUtils.isEmpty(mLoginEditText.getText())){
            Toast.makeText(this, R.string.error_no_login,Toast.LENGTH_LONG).show();
            return;
        }
        if(TextUtils.isEmpty(mPasswordEditText.getText())){
            Toast.makeText(this, R.string.error_no_password,Toast.LENGTH_LONG).show();
            return;
        }

        login=(String) mLoginEditText.getText().toString();
        PreferenceUtils.setLogin(login);
        startActivity(getHomeIntent(login));
    }

    public static void main(String[] args)throws Exception
    {
        //place where file is located. double backward slash should be used.
        File file = new File("");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String string;

        while ((string = br.readLine()) != null)
            if(mLoginEditText.getText() == string){
                if((string = br.readLine()) != null){
                    if(mPasswordEditText.getText() == string){
                        System.out.println("coucou");
                        //ToDo: go to next page
                    }
                    else{
                        System.out.println("Non");
                    }
                }
                else{
                    System.out.println("Non");
                }
            }
            else{
                System.out.println("Non");
            }
    }

}

