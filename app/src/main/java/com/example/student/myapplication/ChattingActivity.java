package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ChattingActivity extends AppCompatActivity {

    private EditText mCattingEdit;
    private Button mCattingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);

        mCattingEdit = (EditText) findViewById(R.id.chatting_edit);
        mCattingButton = (Button) findViewById(R.id.go_button);



    }
}
