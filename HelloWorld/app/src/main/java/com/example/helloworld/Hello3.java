package com.example.helloworld;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Hello3 extends AppCompatActivity implements View.OnClickListener{
    private final static String TAG = "Hell3";
    public String FileName = "Student.txt";
    private EditText edit;
    public ArrayList<String> InfoName = new ArrayList<String>();
    public ArrayList<ArrayList<String>>Info=new ArrayList<ArrayList<String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello3);
        setTitle("Hello3");
        edit = (EditText) findViewById(R.id.editText);
        ReadTxt();//加载数据到List
        ListView listview = (ListView) this.findViewById(R.id.StdInfo);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, InfoName);
        listview.setAdapter(adapter);
        settpButtions();
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String P = InfoName.get(position);
                Toast.makeText(Hello3.this, P, Toast.LENGTH_SHORT).show();
            }
        });
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
        if(v.getId()==R.id.save){
            String inputText = edit.getText().toString();
            save(inputText);
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
        b=(Button)findViewById(R.id.save);
        b.setOnClickListener(this);
    }

    public void save(String inputText) {
        BufferedWriter writer = null;
        try {
            FileOutputStream out = openFileOutput("student", Context.MODE_APPEND);
            writer = new BufferedWriter(new OutputStreamWriter(out));
            writer.write(inputText);
            out.write("\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void ReadTxt() {
        Resources resources = this.getResources();
        InputStream StdInfo = null;
        try {
            StdInfo = openFileInput("student");// 用InputStream方式读取保存在 /res/raw 下的原始文件
            if (StdInfo.available() == 0)
                return;
            if (StdInfo != null) {
                //用utf-8读取文件
                Scanner input = new Scanner(StdInfo, "utf-8");
                while (input.hasNext()) {
                    //将读取出来的数据文件
                    ArrayList<String> SubInfo = new ArrayList<String>();
                    String Name = input.next();//读取下一行并取名
                    SubInfo.add(Name);//列表中加入数据
                    InfoName.add(Name);
                    Info.add(SubInfo);
                }
            }

        } catch (Exception e) {
            Toast.makeText(this, "文件不存在", 1000).show();
        }
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
