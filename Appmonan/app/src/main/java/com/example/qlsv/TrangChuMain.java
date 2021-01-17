package com.example.qlsv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class TrangChuMain extends AppCompatActivity {
    final String DATABASE_NAME = "MonAnNgon.sqlite";
    SQLiteDatabase database;
    Button bt_giaohang;
    Button bt_toi;
    Button bt_tb;
    GridView gridview;
    ArrayList<Monan_data> list;
    Adapter_Monan adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu);
        addControls();
        readData();

        bt_tb=(Button) findViewById(R.id.bt_thongbao);
        bt_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(TrangChuMain.this,ThongBaoActivity.class);
                startActivity(intent);
            }
        });

        bt_toi=(Button) findViewById(R.id.bt_toi);
        bt_toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(TrangChuMain.this,Toi.class);
                startActivity(intent);
            }
        });

        bt_giaohang=(Button) findViewById(R.id.bt_giaohang);
        bt_giaohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(TrangChuMain.this,GiaoHangAtivity.class);
                startActivity(intent);
            }
        });
    }
    private void addControls() {
        gridview = (GridView) findViewById(R.id.GV_trangchu);
        list = new ArrayList<>();
        adapter = new Adapter_Monan(this, list);
        gridview.setAdapter(adapter);
    }

    private void readData(){
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM MonAn",null);
        list.clear();
        for(int i = 0; i < cursor.getCount(); i++){
            cursor.moveToPosition(i);
            byte[] Image_1 = cursor.getBlob(0);
            String tenquan_1 = cursor.getString(1);
            String diachi_1 = cursor.getString(2);

            list.add(new Monan_data(tenquan_1, diachi_1, Image_1));
        }
        adapter.notifyDataSetChanged();
    }
}