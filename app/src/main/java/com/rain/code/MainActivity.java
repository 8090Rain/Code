package com.rain.code;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.rain.code.Activity.AddressActivity;
import com.rain.code.Activity.BaseActivity;
import com.rain.code.Activity.CodeActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    private LinearLayout linear_code, linear_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initLinstner();
    }


    private void initView() {
        linear_code = (LinearLayout) findViewById(R.id.linear_code);
        linear_address = (LinearLayout) findViewById(R.id.linear_address);
    }

    private void initLinstner() {
        linear_code.setOnClickListener(this);
        linear_address.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.linear_code://邮编
                intent.setClass(MainActivity.this, CodeActivity.class);
                startActivity(intent);
                break;
            case R.id.linear_address://邮编地址
                intent.setClass(MainActivity.this, AddressActivity.class);
                startActivity(intent);
                break;
        }
    }
}
