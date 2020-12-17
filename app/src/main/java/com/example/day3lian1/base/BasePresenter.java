package com.example.day3lian1.base;

import retrofit2.http.PUT;

public class BasePresenter<V extends BaseView> {
    public V iView;

    public void addachView(V v){
        iView=v;
    }
}
