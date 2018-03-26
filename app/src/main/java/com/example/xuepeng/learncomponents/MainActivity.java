package com.example.xuepeng.learncomponents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner s;
    private String[] dataSource= new String[]{"选择你想要的功能","选择日期","选择时间","单项选择","多项选择"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intent i =new Intent(MainActivity.this,)
        s=findViewById(R.id.spinner);
        s.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dataSource));
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (dataSource[i] == dataSource[1]) {
                    startActivity(new Intent(MainActivity.this,choseDate.class));
                }
                else if (dataSource[i] == dataSource[2]) {
                    startActivity(new Intent(MainActivity.this,choseTime.class));
                }
                else if (dataSource[i] == dataSource[3]) {
                    startActivity(new Intent(MainActivity.this,singleChose.class));
                }
                else if (dataSource[i] == dataSource[4]) {
                    startActivity(new Intent(MainActivity.this,MulChose.class));
                }
                else return;


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
