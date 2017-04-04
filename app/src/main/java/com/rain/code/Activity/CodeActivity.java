package com.rain.code.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import com.rain.code.Adpter.CodeAdapter;
import com.rain.code.CodeService;
import com.rain.code.Model.CodeModel;
import com.rain.code.R;
import com.rain.code.Utils.ApiUrl;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CodeActivity extends BaseActivity implements View.OnClickListener {
    TextView head_title;
    ImageView btn_back, code_btn_search;
    EditText et_num;
    private RecyclerView mrecyclerview;
    private List<CodeModel.ShowapiResBodyBean.ContentBean> codelist;
    private CodeAdapter codeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_main);
        initView();
        initLinstner();
    }

    private void initView() {
        et_num = (EditText) findViewById(R.id.et_num);
        code_btn_search = (ImageView) findViewById(R.id.code_btn_search);
        head_title = (TextView) findViewById(R.id.head_title);
        head_title.setText("邮编查询");
        btn_back = (ImageView) findViewById(R.id.btn_back);
        mrecyclerview = (RecyclerView) findViewById(R.id.code_recyclerview);
        codelist = new ArrayList<CodeModel.ShowapiResBodyBean.ContentBean>();
    }

    private void initLinstner() {
        btn_back.setOnClickListener(this);
        code_btn_search.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_back://返回
                finish();
                break;
            case R.id.code_btn_search:
                query();
                break;

        }
    }


    private void query() {
        String num = et_num.getText().toString();
        Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(ApiUrl.BaseUrl).build();
        CodeService codeService = retrofit.create(CodeService.class);
        Call<CodeModel> Call = codeService.getResult(34898, "14c6c027c151486baf1634a8524cda23", num);
        Call.enqueue(new Callback<CodeModel>() {
            @Override
            public void onResponse(Call<CodeModel> call, Response<CodeModel> response) {
                if (response.isSuccessful()) {
                    if (response.body().getShowapi_res_body().getError_description().equals("查询成功")) {
                        codelist = response.body().getShowapi_res_body().getContent().get_$1();
                        codeAdapter = new CodeAdapter(CodeActivity.this,codelist);
                        mrecyclerview.setAdapter(codeAdapter);
                    }
                }
            }

            @Override
            public void onFailure(Call<CodeModel> call, Throwable t) {

            }
        });
    }
}
