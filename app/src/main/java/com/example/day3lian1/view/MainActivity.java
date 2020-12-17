package com.example.day3lian1.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day3lian1.R;
import com.example.day3lian1.adpter.MainAdapter;
import com.example.day3lian1.base.BaseActivity;
import com.example.day3lian1.bean.MainBean;
import com.example.day3lian1.contract.MainContract;
import com.example.day3lian1.presenter.MainPresenter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainView {

    private RecyclerView mRlv;
    private ArrayList<MainBean.StudenlistBean> list;
    private MainAdapter adapter;

    @Override
    protected void initData() {
        presenter.getSuccess();
    }

    @Override
    protected void initView() {
        mRlv = findViewById(R.id.rlv);
        mRlv.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        adapter = new MainAdapter(this, list);
        mRlv.setAdapter(adapter);
    }

    @Override
    protected MainPresenter add() {
        return new MainPresenter(this);
    }

    @Override
    protected int getLayoutid() {
        return R.layout.activity_main;
    }

    @Override
    public void success(MainBean mainBean) {
        list.addAll(mainBean.getStudenlist());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void error(String error) {

    }
}