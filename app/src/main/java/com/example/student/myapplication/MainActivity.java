package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //레이아웃 표시
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "버튼을 클릭 하셨습니다!", Toast.LENGTH_SHORT).show();
    }
}
