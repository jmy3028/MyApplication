package com.example.student.myapplication.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.student.myapplication.models.Chatting;

import java.util.List;

/**
 * Created by Student on 2017-02-09.
 */

public class ChattingListAdapter extends BaseAdapter {

    private List<Chatting> mdata;

    @Override
    public int getCount() {
        return mdata.size();
    }

    @Override
    public Object getItem(int position) {
        return mdata.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){

        }

    }

    private static class ViewHolder {
    }
}
