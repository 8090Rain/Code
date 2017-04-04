package com.rain.code.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rain.code.R;

public class AddressActivity extends BaseActivity implements View.OnClickListener {
    TextView head_title;
    ImageView btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address_main);
        initView();
        initLinstner();
    }

    private void initView() {
        head_title = (TextView)findViewById(R.id.head_title);
        head_title.setText("地址查询");
        btn_back = (ImageView)findViewById(R.id.btn_back);
    }

    private void initLinstner() {
        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_back://返回
                finish();
                break;

        }
    }
}
