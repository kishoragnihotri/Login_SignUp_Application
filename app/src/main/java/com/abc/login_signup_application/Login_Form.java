package com.abc.login_signup_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__form);
        getSupportActionBar().setTitle("Login Here");
    }

    public void sing_upForm(View view) {
        startActivity(new Intent(getApplicationContext(),Sign_Up_Form.class));


    }
}
