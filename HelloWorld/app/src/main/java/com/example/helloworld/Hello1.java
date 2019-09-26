package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello1 extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "Hello1";
    private static int objCount = 0;
    private int mObjCount;

    
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        setTitle("Hello1");
        objCount++;
        mObjCount=objCount;
        Log.d(TAG, mObjCount+"-onCreate");
        settupClicks();
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

        private void settupClicks () {
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
        Log.d(TAG, mObjCount+"-onStart");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.d(TAG, mObjCount+"-onResume");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.d(TAG, mObjCount+"-onPause");
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.d(TAG, mObjCount+"-onStop");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d(TAG, mObjCount+"-onDestroy");
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.d(TAG, mObjCount+"-onRestart");

    }
}
