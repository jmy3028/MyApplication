package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BasketballActivity extends AppCompatActivity {

    private TextView mScore;
    private Button mthreeScore;
    private Button mtwoScore;
    private Button mFreeScore;
    private TextView mbScore;
    private Button mbthreeScore;
    private Button mbtwoScore;
    private Button mbFreeScore;
    private Button mReSet;

    private int mTotalScore=0;
    private int mbTotalScore=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);

        mScore = (TextView) findViewById(R.id.num_text);
        mthreeScore = (Button) findViewById(R.id.three_point);
        mtwoScore = (Button) findViewById(R.id.two_point);
        mFreeScore = (Button) findViewById(R.id.free_point);
        mbScore = (TextView) findViewById(R.id.bnum_text);
        mbthreeScore = (Button) findViewById(R.id.bthree_point);
        mbtwoScore = (Button) findViewById(R.id.btwo_point);
        mbFreeScore = (Button) findViewById(R.id.bfree_point);
        mReSet = (Button) findViewById(R.id.reset_view);

        mthreeScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mTotalScore = mTotalScore + 3;
                mScore.setText("" + mTotalScore);
            }
        });

        mtwoScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTotalScore = mTotalScore + 2;
                mScore.setText("" + mTotalScore);
            }
        });

        mFreeScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTotalScore = mTotalScore + 1;
                mScore.setText("" + mTotalScore);
            }
        });
        mbthreeScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbTotalScore = mbTotalScore + 3;
                mbScore.setText("" + mbTotalScore);
            }
        });

        mbtwoScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbTotalScore = mbTotalScore + 2;
                mbScore.setText("" + mbTotalScore);
            }
        });

        mbFreeScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbTotalScore = mbTotalScore + 1;
                mbScore.setText("" + mbTotalScore);
            }
        });

        mReSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTotalScore = 0;
                mbTotalScore = 0;
                mScore.setText("" + mTotalScore);
                mbScore.setText("" + mbTotalScore);
            }
        });

    }
}
