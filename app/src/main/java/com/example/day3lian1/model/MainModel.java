package com.example.day3lian1.model;

import com.example.day3lian1.contract.MainContract;
import com.example.day3lian1.utils.INetCallBack;
import com.example.day3lian1.utils.Retrofitutils;

public class MainModel implements MainContract.IMainModel {
    private MainContract.IMainPresenter iMainPresenter;

    public MainModel(MainContract.IMainPresenter iMainPresenter) {
        this.iMainPresenter = iMainPresenter;
    }

    @Override
    public <T> void onGet(String url, INetCallBack<T> iNetCallBack) {
        Retrofitutils.getInstance().get(url,iNetCallBack);
    }
}
