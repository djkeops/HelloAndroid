package com.example.android.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://auth.udacity.com/sign-up"));
        if (browserIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(browserIntent);
        }
    }
}
