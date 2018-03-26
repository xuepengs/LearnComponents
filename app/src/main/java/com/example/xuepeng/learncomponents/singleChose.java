package com.example.xuepeng.learncomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class singleChose extends AppCompatActivity {
    private Button btnSubmit;
    private RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_chose);
        btnSubmit=findViewById(R.id.btnSubmit);
        rb=findViewById(R.id.rBA);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb.isChecked()){
                    Toast.makeText(singleChose.this,"所选择的是正确的 ",Toast.LENGTH_SHORT).show();
                }else Toast.makeText(singleChose.this,"所选择的是错误的 ",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
