package com.example.qlsv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CaiDat extends AppCompatActivity {
    Button bt_qllai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caidat_layout);
        bt_qllai = (Button) findViewById(R.id.bt_qlai);
        bt_qllai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuaylai();
            }
        });


    }

    public void openQuaylai() {
        Intent it = new Intent(CaiDat.this, Toi.class);
        startActivity(it);
    }
}
