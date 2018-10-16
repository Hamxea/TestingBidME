package com.hamzamohammed.testingbidme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setcod e-
    }

    public void onLoginButtonClicked(View view) {
        setContentView(R.layout.empy_activity);
    }
    public void onSignupLinkClicked(View view){
        setContentView(R.layout.activity_register);
        //fdsf
    }
}
