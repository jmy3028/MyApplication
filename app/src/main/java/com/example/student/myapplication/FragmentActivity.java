package com.example.student.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.student.myapplication.fragments.ColorFragment;

public class FragmentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

    }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.first_fragment:
                ColorFragment newColorFragment1 = new ColorFragment();
                int color1 = Color.RED;
                newColorFragment1.setColor(color1);
                // 기존의 프래그먼트를 교체
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.first_fragment_layout, newColorFragment1)
                        .commit();
                break;
            case R.id.second_fragment:
                ColorFragment newColorFragment = new ColorFragment();
                int color = Color.BLUE;
                newColorFragment.setColor(color);
                // 기존의 프래그먼트를 교체
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.second_fragment_layout, newColorFragment)
                        .commit();
                break;
            case R.id.third_fragment:
                ColorFragment newColorFragment2 = new ColorFragment();
                int color2 = Color.YELLOW;
                newColorFragment2.setColor(color2);
                // 기존의 프래그먼트를 교체
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.third_fragment_layout, newColorFragment2)
                        .commit();
                break;
        }

    }

}
