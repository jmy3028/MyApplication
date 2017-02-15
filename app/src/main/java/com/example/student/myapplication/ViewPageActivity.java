package com.example.student.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.student.myapplication.adapters.ColorListAdapter;
import com.example.student.myapplication.fragments.ColorFragment;
import com.example.student.myapplication.models.ColorList;

import java.util.List;

public class ViewPageActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    private List<ColorList> mViewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        mTabLayout = (TabLayout) findViewById(R.id.tab);
        mViewPager = (ViewPager) findViewById(R.id.pager);

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);

        mTabLayout.setupWithViewPager(mViewPager);
    }

    private static class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    
                    ColorListAdapter colorListAdapter = new ColorListAdapter(Context ,);
                    return ColorFragment.newInstance(Color.RED);
                case 1:
                    return ColorFragment.newInstance(Color.BLUE);
                case 2:
                    return ColorFragment.newInstance(Color.YELLOW);
                case 3:
                    return ColorFragment.newInstance(Color.CYAN);
            }
            return null;
        }

        @Override
        public Fragment getItemid(int position) {

        }

        @Override
        public int getCount() {
            return 4;
        }

        // 제목 표시
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "영어 소문자";
                case 1:
                    return "영어 대문자";
                case 2:
                    return "한글";
                case 3:
                    return "숫자";
            }
            return null;
        }
    }
}
