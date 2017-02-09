package com.example.student.myapplication.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.student.myapplication.R;
import com.example.student.myapplication.models.ColorList;

import java.util.List;

/**
 * Created by Student on 2017-02-09.
 */

public class ColorListAdapter extends BaseAdapter {
    private Context mContext;
    private List<ColorList> mData;

    public ColorListAdapter(Context mContext, List<ColorList> mData) {
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
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        // convertView : 재사용 되는 뷰
        if (convertView == null) {
            viewHolder = new ViewHolder();

            // 뷰를 새로 만들 때
            convertView = LayoutInflater.from(mContext)
                    .inflate(R.layout.item_colorlist, parent, false);

            // 레이아웃 들고 오기
            TextView colorListTextView = (TextView) convertView.findViewById(R.id.color_list_text);



            // 뷰 홀더에 넣는다
            viewHolder.colorListTextView = colorListTextView;

            convertView.setTag(viewHolder);
        } else {
            // 재사용 할 때
            viewHolder = (ViewHolder) convertView.getTag();
        }


        // 데이터
        ColorList colorList = mData.get(position);

        // 화면에 뿌리기
        viewHolder.colorListTextView.setText(colorList.getmColorList());

        // 홀수 줄은 빨간 색
        if (position % 2 == 1) {
            convertView.setBackgroundColor(Color.RED);
        } else if(position == 0){
            convertView.setBackgroundColor(Color.BLACK);
        }else {
            convertView.setBackgroundColor(Color.BLUE);
        }
        return convertView;
    }

    // -1이면 선택된게 없다
    private int mSeletedPosition = -1;

    public void setSelect(int position) {
        mSeletedPosition = position;
    }

    // findViewById로 가져온 View 들을 보관
    private static class ViewHolder {
        TextView colorListTextView;
    }
}

