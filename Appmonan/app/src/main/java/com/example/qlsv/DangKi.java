package com.example.qlsv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DangKi extends AppCompatActivity {
    Button btSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangki);
        btSignUp =(Button) findViewById(R.id.btsignup);
        btSignUp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(DangKi.this, "Đăng kí thành công", Toast.LENGTH_LONG).show();
                Intent it =new Intent(DangKi.this, DangNhap.class);
                startActivity(it);
            }
        });
    }
}
