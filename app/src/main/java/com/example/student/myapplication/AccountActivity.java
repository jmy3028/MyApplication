package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static com.example.student.myapplication.R.id.Re_enter_button;
import static com.example.student.myapplication.R.id.opened_button;

public class AccountActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mIdEditText;
    private EditText mPasswordEditText;
    private EditText mPasswordConfirmEditText;
    private EditText mBalanceEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mIdEditText = (EditText) findViewById(R.id.id_editText);
        mPasswordEditText = (EditText) findViewById(R.id.password_editText);
        mPasswordConfirmEditText = (EditText) findViewById(R.id.password_confirm_editText);
        mBalanceEditText = (EditText) findViewById(R.id.balance_editText);

        findViewById(R.id.Re_enter_button).setOnClickListener(this);
        findViewById(opened_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case Re_enter_button:
//                //저장을 눌렀을때 AccountAdapter에 저장
//                AccountAdapter accountAdapter = new AccountAdapter(mIdEditText,
//                        mPasswordEditText,mBalanceEditText);
                break;
            case opened_button:
                //재입력을 눌렀을때 초기화
                mIdEditText.setText(null);
                mPasswordEditText.setText(null);
                mPasswordConfirmEditText.setText(null);
                mBalanceEditText.setText(null);
                break;
        }
    }
}
