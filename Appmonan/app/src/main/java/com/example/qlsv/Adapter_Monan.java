package com.example.qlsv;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_Monan extends BaseAdapter{
    Activity context;
    ArrayList<Monan_data> list;

    public Adapter_Monan(Activity context, ArrayList<Monan_data> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.product_gridview, null);
        ImageView Image_1 = (ImageView) row.findViewById(R.id.product_img);
        TextView tenquan_1 = (TextView) row.findViewById(R.id.product_tenquan);
        TextView diachi_1 = (TextView) row.findViewById(R.id.product_diachi);

        final Monan_data monandata = list.get(position);
        tenquan_1.setText(monandata.tenquan);
        diachi_1.setText(monandata.diachi);

        Bitmap bmHinhDaiDien = BitmapFactory.decodeByteArray(monandata.Image, 0, monandata.Image.length);
        Image_1.setImageBitmap(bmHinhDaiDien);
        return row;
    }
}
