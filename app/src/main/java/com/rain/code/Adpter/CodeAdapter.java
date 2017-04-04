package com.rain.code.Adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rain.code.Model.CodeModel;
import com.rain.code.R;

import java.util.List;

/**
 * CodeAdapter
 */

public class CodeAdapter extends RecyclerView.Adapter<CodeAdapter.MyViewHolder> {
    private List<CodeModel.ShowapiResBodyBean.ContentBean> codelist;
    private Context mContext;

    public CodeAdapter(Context mContext, List<CodeModel.ShowapiResBodyBean.ContentBean> codelist) {
        this.mContext = mContext;
        this.codelist = codelist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.code_item, parent, false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(CodeAdapter.MyViewHolder holder, int position) {
        holder.code_num.setText(codelist.get(position).get_$1().getZip());
        holder.code_address.setText(codelist.get(position).get_$1().getAddr());
    }

    @Override
    public int getItemCount() {
        return codelist.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView code_num, code_address;

        public MyViewHolder(View view) {
            super(view);
            code_num = (TextView) view.findViewById(R.id.code_num);
            code_address = (TextView) view.findViewById(R.id.code_address);
        }
    }
}
