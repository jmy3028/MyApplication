package com.example.student.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.student.myapplication.R.id.account_Lookup_button;
import static com.example.student.myapplication.R.id.account_button;
import static com.example.student.myapplication.R.id.end_button;
import static com.example.student.myapplication.R.id.manager_button;

public class ListViewEaxm2 extends AppCompatActivity implements View.OnClickListener {

    private Button mAccount;
    private Button mLogin;
    private Button mManager;
    private Button mEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_eaxm2);

        findViewById(account_button).setOnClickListener(this);
        findViewById(account_Lookup_button).setOnClickListener(this);
        findViewById(manager_button).setOnClickListener(this);
        findViewById(end_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case account_button:
                Intent accountIntent = new Intent(this,AccountActivity.class);
                startActivity(accountIntent);
                break;
            case account_Lookup_button:
                Intent loginIntent = new Intent(this,LoginActivity.class);
                startActivity(loginIntent);
                break;
            case manager_button:
                showCustomDialog();
                break;
            case end_button:
                finish();
                break;
        }
    }

    private void showCustomDialog() {
        View view = LayoutInflater.from(this).inflate(R.layout.loginmanager, null, false);
        final EditText idEditText = (EditText) view.findViewById(R.id.login_id_editText);
        final EditText passWordEditText = (EditText) view.findViewById(R.id.login_password_editText);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setPositiveButton("로그인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //id와 password가 기존에 저장된 값이랑 맞는 지 판별하는 작업을 해야됨
                String id = idEditText.getText().toString();
                String pass = passWordEditText.getText().toString();
                Toast.makeText(ListViewEaxm2.this,"관리자모드로 로그인 하셨습니다", Toast.LENGTH_SHORT).show();

            }
        });
        builder.setNegativeButton("닫기", null);
        builder.setView(view);
        builder.show();
    }

}
