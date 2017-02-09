package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.student.myapplication.adapters.ColorListAdapter;
import com.example.student.myapplication.models.ColorList;

import java.util.ArrayList;
import java.util.List;

public class ColorListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<ColorList> mColorList;

    private ListView mListView;
    private ColorListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_list);

        mListView = (android.widget.ListView) findViewById(R.id.color_list_view);

        mColorList = new ArrayList<>();
        for (int i = 100; i >= 0; i--) {
            mColorList.add(new ColorList("포지션" + i));

        }
        mAdapter = new ColorListAdapter(this,mColorList);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mAdapter.setSelect(position);
        // 데이터가 변경됨을 알려줌 = 다시 그려라
        mAdapter.notifyDataSetChanged();
    }
}
