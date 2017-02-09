package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NewMemoActivity extends AppCompatActivity {
    private List<ListView> titleList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_memo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.cancel_setting){
            Toast.makeText(this,"취소 하였습니다",Toast.LENGTH_SHORT).show();
            finish();
        }else {
            titleList.add(new ListView(R.id.title_edit_text,R.id.contents_edit_text));
            Toast.makeText(this,"메모를 추가하였습니다",Toast.LENGTH_SHORT).show();
            finish();
        }
        return false;
    }
}
