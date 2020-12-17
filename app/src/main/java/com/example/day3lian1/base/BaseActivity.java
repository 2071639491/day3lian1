package com.example.day3lian1.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity <p extends BasePresenter> extends AppCompatActivity implements BaseView {
    public p presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutid());
        if (presenter==null){
            presenter=add();
            presenter.addachView(this);
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract p add();

    protected abstract int getLayoutid();
}
