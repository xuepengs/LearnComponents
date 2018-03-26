package com.example.xuepeng.learncomponents;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class choseDate extends AppCompatActivity {
    private Button btnchosedate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_date);
        btnchosedate=findViewById(R.id.btnChosedate);
        btnchosedate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(choseDate.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        String thedate=String.format("%d-%d-%d",i,i1+1,i2);
                        System.out.println(thedate);
                        btnchosedate.setText(thedate);

                    }
                },2018,2,26).show();


            }
        });
    }
}
