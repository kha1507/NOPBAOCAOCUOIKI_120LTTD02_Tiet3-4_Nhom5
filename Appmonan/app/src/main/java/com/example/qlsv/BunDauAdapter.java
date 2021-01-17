package com.example.qlsv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BunDauAdapter  extends BaseAdapter {
    Context context;
    int Layout;
    List<BunDau> arrayList;

    public BunDauAdapter(Context context, int layout, List<BunDau> arrayList) {
        this.context = context;
        Layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        TextView tvtemon1;
        TextView tvgia1;
        ImageView Img2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        BunDauAdapter.ViewHolder viewHolder;
        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(Layout, null);
            viewHolder = new ViewHolder();

            viewHolder.tvtemon1 = (TextView) convertView.findViewById(R.id.product_tenmon);
            viewHolder.tvgia1 = (TextView) convertView.findViewById(R.id.product_gia);
            viewHolder.Img2 = (ImageView) convertView.findViewById(R.id.product_img1);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (BunDauAdapter.ViewHolder) convertView.getTag();
        }
        viewHolder.tvtemon1.setText(arrayList.get(position).tenmon);
        viewHolder.tvgia1.setText(arrayList.get(position).giaca);
        viewHolder.Img2.setImageResource(arrayList.get(position).img2);
        return convertView;
    }
}

