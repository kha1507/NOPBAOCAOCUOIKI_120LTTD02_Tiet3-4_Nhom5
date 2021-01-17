package com.example.qlsv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Moi_Ban_Be extends AppCompatActivity {
    Button bt_qlai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moi_ban_be_layout_);
        bt_qlai = (Button) findViewById(R.id.bt_ql);
        bt_qlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuaylai();
            }
        });


    }

    public void openQuaylai() {
        Intent it = new Intent(Moi_Ban_Be.this, Toi.class);
        startActivity(it);
    }
}
