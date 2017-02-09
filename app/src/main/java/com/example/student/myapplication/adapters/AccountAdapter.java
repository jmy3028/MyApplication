package com.example.student.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.student.myapplication.R;
import com.example.student.myapplication.models.Account;

import java.util.List;

/**
 * Created by Student on 2017-02-08.
 */

public class AccountAdapter extends BaseAdapter {

    private List<Account> mdata;

    public AccountAdapter(List<Account> accountList) {
        this.mdata = accountList;
    }

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
        // convertView : 재사용 되는 뷰
        if (convertView == null) {
            viewHolder = new ViewHolder();

            // 뷰를 새로 만들 때
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_list, parent, false);

            // 레이아웃 들고 오기
            TextView titleTextView = (TextView) convertView.findViewById(R.id.id_text_view);
            TextView contentTextView = (TextView) convertView.findViewById(R.id.password_text_view);

            // 뷰 홀더에 넣는다
            viewHolder.titleTextView = titleTextView;
            viewHolder.contentTextView = contentTextView;

            convertView.setTag(viewHolder);
        } else {
            // 재사용 할 때
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // 데이터
        Account memo = mdata.get(position);

        // 화면에 뿌리기
        viewHolder.titleTextView.setText(memo.getmAccountId());
        viewHolder.contentTextView.setText(memo.getmAccountBalance());

        return convertView;
    }

    // findViewById로 가져온 View 들을 보관
    private static class ViewHolder {
        TextView titleTextView;
        TextView contentTextView;
    }

}


