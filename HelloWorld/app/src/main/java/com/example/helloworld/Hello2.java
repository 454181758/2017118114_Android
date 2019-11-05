package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Hello2 extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "Hello2";

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    private String[] data = {"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango",
            "Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
        initFruits(); // 初始化水果数据，就是下面的私有函数，添加到列表里面准备显示
        FruitAdapter adapter = new FruitAdapter(Hello2.this, R.layout.fruit_item, fruitList);//
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(Hello2.this,android.R.layout.simple_list_item_1,data);
        //ArrayAdapter传入当前上下文、子项布局id,和配饰的数据。android.R.layout.simple_list_item_1,data为系统内置布局文件。
        ListView listView = (ListView) findViewById(R.id.fruit);
        Log.d(TAG, "onCreate execute");
        setTitle("Hello2");
        settpButtions();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(Hello2.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.drawable.mango_pic);
            fruitList.add(mango);
        }
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
