package com.example.qlsv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DangNhap  extends AppCompatActivity {
    Button btdangnhap;
    EditText edtemail, edtpassword;
    Button btdienthoai;
    Button btfacebook;
    Button btgoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);

        edtemail=(EditText) findViewById(R.id.edtEmail);
        edtpassword=(EditText) findViewById(R.id.edtPassword);
        btdangnhap = (Button) findViewById(R.id.bt_dangnhap);
        btdangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlButton();
            }
        });
    }
    private void ControlButton() {
        if (edtemail.getText().length() != 0 && edtpassword.getText().length() != 0) {
            if (edtemail.getText().toString().equals("1811505310307") && edtpassword.getText().toString().equals("tuandung")) {
                Toast.makeText(DangNhap.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();

                //chuyen giua cac giao dien vói nhau
                Intent intent = new Intent(DangNhap.this, Toi.class);
                startActivity(intent);

            } else {
                Toast.makeText(DangNhap.this, "Bạn đã đăng nhập thất bại", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(DangNhap.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
        }

        btdienthoai = (Button) findViewById(R.id.bt_dienthoai);
        btdienthoai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToi();
            }
        });

        btfacebook = (Button) findViewById(R.id.bt_fb);
        btfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToi();
            }
        });

        btgoogle = (Button) findViewById(R.id.bt_gg);
        btgoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToi();
            }
        });

    }


    public void openToi() {
        Intent it=new Intent(DangNhap.this,Toi.class);
        startActivity(it);
    }

}
