package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello1 extends AppCompatActivity {
        private static final String TAG = "Hello1";
        private Button b;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d(TAG, "onCreate execute");
        b=(Button) findViewById(R.id.bt_hello2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(com.example.helloworld.Hello1.this,Hello2.class);
                startActivity(intent);
            }
        });
        settupClicks();

    }

        public void onClick (View v){

        if (v.getId() == R.id.bt_hello1) {

        }
        if (v.getId() == R.id.bt_hello1) {

        }
    }
        private void settupClicks () {
        Button b;
        b = (Button) findViewById(R.id.bt_hello1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
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
