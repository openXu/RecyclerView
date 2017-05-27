package com.openxu.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button btn_1, btn_2, btn_3, btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);


        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);

    }


    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_1:
                startActivity(new Intent(this, TestActivity1.class));
                break;
            case R.id.btn_2:
                startActivity(new Intent(this, TestActivity2.class));
                break;
            case R.id.btn_3:
                startActivity(new Intent(this, TestActivity3.class));
                break;
            case R.id.btn_4:
                startActivity(new Intent(this, TestActivity4.class));
                break;



        }
    }


}
