package com.arbiiapplication.webandlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String extramsg="com.example.task_2.extramsg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void webURL(View view) {
        EditText et_web;
        et_web = (EditText) findViewById(R.id.et_web);
        String et_w = et_web.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(et_w));
        startActivity(intent);
    }

    public void locationName(View view) {
            EditText et_map;
            et_map=(EditText)findViewById(R.id.et_map);
            String et_m=et_map.getText().toString();
            String url="geo:0, 0?q="+et_m;

            Intent intent2=new Intent(Intent.ACTION_VIEW, Uri.parse(url) );
            startActivity(intent2);
    }
}