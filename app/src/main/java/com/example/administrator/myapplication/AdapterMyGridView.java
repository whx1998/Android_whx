package com.example.administrator.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Administrator on 2019/1/2.
 */

public class AdapterMyGridView extends BaseAdapter {
    private Context mContext;
    public AdapterMyGridView(Context mContext){
        this.mContext=mContext;
    }
    @Override
    public int getCount() {
        return 50;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(mContext).inflate(R.layout.adapter_gridview,null);
        }
        return convertView;
    }
}
