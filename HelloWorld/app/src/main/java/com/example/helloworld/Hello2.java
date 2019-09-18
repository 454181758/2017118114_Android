package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello2 extends AppCompatActivity {
    private static final String TAG = "Hello2";
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
        Log.d(TAG, "onCreate execute");
        b=(Button) findViewById(R.id.bt_hello1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(com.example.helloworld.Hello2.this,Hello1.class);
                startActivity(intent);
            }
        });
    }
}
