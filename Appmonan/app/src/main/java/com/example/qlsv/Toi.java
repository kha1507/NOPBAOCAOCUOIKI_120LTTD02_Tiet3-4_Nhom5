package com.example.qlsv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Toi extends AppCompatActivity {
    Button btTrangChu;
    Button btThongTinCN;
    Button btMoiBanBe;
    Button bt_CaiDat;
    Button btThongBao;
    Button btDangXuat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toi);

        bt_CaiDat=(Button) findViewById(R.id.bt_caidat);
        bt_CaiDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Toi.this,CaiDat.class));
            }
        });

        btMoiBanBe=(Button) findViewById(R.id.moibanbe);
        btMoiBanBe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Toi.this,Moi_Ban_Be.class));
            }
        });

        btThongBao=(Button) findViewById(R.id.btthongbao);
        btThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Toi.this,ThongBaoActivity.class));
            }
        });

        btDangXuat=(Button)findViewById(R.id.button_DangXuat);
        btDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDangXuat();
            }

            public void openDangXuat() {
                Intent DX =new Intent(Toi.this, DangNhap.class);
                startActivity(DX);
            }
        });

        btTrangChu=(Button)findViewById(R.id.bt_trangchu);
        btTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });

        btThongTinCN = (Button)findViewById(R.id.bt_thongtincanhan);
        btThongTinCN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThongTin();
            }

            public void openThongTin() {
                Intent TT=new Intent(Toi.this, ThongTinCaNhan.class);
                startActivity(TT);
            }
        });

    }
    public void openProfile(){
        Intent it=new Intent(Toi.this,TrangChuMain.class);
        startActivity(it);
    }


}

