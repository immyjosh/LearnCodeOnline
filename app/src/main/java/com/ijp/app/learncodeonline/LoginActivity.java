package com.ijp.app.learncodeonline;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity  {


    public Button email_sign_in_button;
    public TextView sign_up;
    public ImageView logo;
    public TextView login_logo_text;

    Animation slide_down;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email_sign_in_button=findViewById(R.id.login_button);
        sign_up=findViewById(R.id.sign_up);
        logo=findViewById(R.id.login_logo);
        login_logo_text=findViewById(R.id.login_logo_text);

        slide_down=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);

        logo.setAnimation(slide_down);
        login_logo_text.setAnimation(slide_down);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });

        email_sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }



}

