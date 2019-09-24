package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello2 extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "Hello2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
        Log.d(TAG, "onCreate execute");
        setTitle("Hello2");
        settpButtions();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bt_hello1){
            Intent intent;
            intent=new Intent(this,Hello1.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.bt_hello2){
            Intent intent;
            intent=new Intent(this,Hello2.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.bt_hello3){
            Intent intent;
            intent=new Intent(this,Hello3.class);
            startActivity(intent);
        }
    }

    private void settpButtions(){
        Button b;
        b=(Button)findViewById(R.id.bt_hello1);
        b.setOnClickListener(this);
        b=(Button)findViewById(R.id.bt_hello2);
        b.setOnClickListener(this);
        b=(Button)findViewById(R.id.bt_hello3);
        b.setOnClickListener(this);
    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.d(TAG, "onRestart");

    }
}
