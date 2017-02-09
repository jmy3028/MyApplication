package com.example.student.myapplication.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.student.myapplication.ListView;

import java.util.List;

/**
 * Created by Student on 2017-02-07.
 */

public class MeMoAdapter extends BaseAdapter {

    private Context mContext;
    private List<ListView> mData;

    public MeMoAdapter(Context mContext, List<ListView> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder viewHolder;
//        // convertView : 재사용 되는 뷰
//        if (convertView == null) {
//            viewHolder = new ViewHolder();
//
//            // 뷰를 새로 만들 때
//            convertView = LayoutInflater.from(mContext)
//                    .inflate(R.layout.item_weather, parent, false);
//
//            // 레이아웃 들고 오기
//            TextView locationTextView = (TextView) convertView.findViewById(R.id.location_text);
//            TextView temperatureTextView = (TextView) convertView.findViewById(R.id.temperature_text);
//
//            // 뷰 홀더에 넣는다
//            viewHolder.locationTextView = locationTextView;
//            viewHolder.temperatureTextView = temperatureTextView;
//
//            convertView.setTag(viewHolder);
//        } else {
//            // 재사용 할 때
//            viewHolder = (ViewHolder) convertView.getTag();
//        }
//
//        Log.d(TAG, "getView: " + position);
//
//        // 데이터
//        Weather weather = mData.get(position);
//
//        // 화면에 뿌리기
//        viewHolder.locationTextView.setText(weather.getLocation());
//        viewHolder.temperatureTextView.setText(weather.getTemperature());

//        return null;
//    }

    private class ViewHolder {
        TextView locationTextView;
        TextView temperatureTextView;
    }
}
