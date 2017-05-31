package com.example.chauhan.percento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_per2unit, btn_unit2per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){

        btn_per2unit= (Button)findViewById(R.id.button_per2unit);
        btn_unit2per=(Button)findViewById(R.id.button_unit2per);
        btn_per2unit.setOnClickListener(this);
        btn_unit2per.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if(id==R.id.button_per2unit) {

            Intent intent = new Intent(this, PercentoActivity.class);
            startActivity(intent);
        }
        if(id==R.id.button_unit2per) {

            Intent intent = new Intent(this, PercentoActivity.class);
            startActivity(intent);
        }
    }
}
