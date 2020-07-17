package com.fitness.testdemo;

import androidx.appcompat.app.AppCompatActivity;


import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private ImageButton btRegister;
    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        btRegister  = findViewById(R.id.btRegister);
        tvLogin     = findViewById(R.id.tvLogin);
        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v==btRegister){
                    Intent intent   = new Intent(Login.this,Register.class);
                    Pair[] pairs    = new Pair[1];
                    pairs[0] = new Pair<View,String>(tvLogin,"tvLogin");
                    ActivityOptions activityOptions=null;
                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                         activityOptions = ActivityOptions.makeSceneTransitionAnimation(Login.this,pairs);
                    }
                    startActivity(intent,activityOptions.toBundle());
                }
            }
        });
    }
}