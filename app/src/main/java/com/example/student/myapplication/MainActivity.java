package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final int price = 3000;
    private static int mIsCreampay = 500;
    private static final String TAG = MainActivity.class.getSimpleName();
    //모델변수에다가는 변수이름 앞에 m을 안붙일거고 모델변수가 아닌 건 m을 붙일거다
    private Button mMinusButton;
    private Button mPlusButton;
    private TextView mQuantityTextView;
    private TextView mResultTextView;
    private Button mOrderButton;
    private CheckBox mCreamCheckBox;
    private boolean mIsCream;

    //수량
    private int mQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //초기화 메소드를 만듬
        init();

        //레이아웃 표시
        setContentView(R.layout.justjava);

        //레이아웃에서 특정 id를 인스턴스 변수와 연결
        mMinusButton = (Button) findViewById(R.id.minus_button);
        mPlusButton = (Button) findViewById(R.id.plus_button);
        mOrderButton = (Button) findViewById(R.id.order_button);
        mQuantityTextView = (TextView) findViewById(R.id.number_text_view);
        mResultTextView = (TextView) findViewById(R.id.total_text_view);
        mCreamCheckBox = (CheckBox) findViewById(R.id.cream_check);

        //무명클래스
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mQuantity--;
                if (mQuantity < 0) {
                    mQuantity = 0;
                }

                displayResult();


//                //debug
//                Log.d(TAG,"마이너스 버튼 클릭");
//                Log.v(TAG,"일반로그");
//                Log.e(TAG,"에러로그");
//                Log.i(TAG,"정보로그");
//                Log.w(TAG,"경고로그");
//
//                //토스트 메세지
//                Toast.makeText(MainActivity.this,"메세지",Toast.LENGTH_SHORT).show();
//

            }
        });
        //무명클래스
        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mQuantity++;
                if (mQuantity > 10) {
                    mQuantity = 10;
                }


                displayResult();
            }
        });

        mOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = mResultTextView.getText().toString();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(this,);
//                startActivity(intent);

            }
        });

        mCreamCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mIsCream = isChecked;
                displayResult();
            }
        });
    }

    private void displayResult() {
        mQuantityTextView.setText("" + mQuantity);
        int totalprice = price * mQuantity;
        if (mIsCream == true) {
            mIsCreampay = mQuantity * mIsCreampay;
        } else {
            mIsCreampay = 0;
        }

        String result = String.format("가격 : %d원\n수량 : %d개\n휘핑크림 : %s\n감사합니다",
                totalprice + mIsCreampay, mQuantity, mIsCream);

        mResultTextView.setText(result);
    }

    private void init() {
        mQuantity = 0;
    }

    //메뉴를 붙이는 부분
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_setting:
                Toast.makeText(this,"설정 아직 미구현",Toast.LENGTH_SHORT);
                return true;
            case R.id.action_Item2:
                return true;
            case R.id.action_Item3:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
