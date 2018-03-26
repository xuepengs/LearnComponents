package com.example.xuepeng.learncomponents;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class choseTime extends AppCompatActivity {

    private Button btnChoseTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_time);
        btnChoseTime=findViewById(R.id.btnChoseTime);
        btnChoseTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new TimePickerDialog(choseTime.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        String theTime= String.format("%d:%d",i,i1);
                        System.out.println(theTime);
                        btnChoseTime.setText(theTime);

                    }
                },0,0,true).show();
            }
        });
    }
}
