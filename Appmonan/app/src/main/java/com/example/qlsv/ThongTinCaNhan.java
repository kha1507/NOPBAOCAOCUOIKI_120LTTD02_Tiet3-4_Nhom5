package com.example.qlsv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThongTinCaNhan extends AppCompatActivity {
    Button bt_ql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongtincanhan);
        bt_ql = (Button) findViewById(R.id.bt_quaylai);
        bt_ql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuaylai();
            }
        });


    }

    public void openQuaylai() {
        Intent it = new Intent(ThongTinCaNhan.this, Toi.class);
        startActivity(it);
    }
}
