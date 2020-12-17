package com.example.day3lian1.utils;

public interface INetCallBack<T> {
    public void onSuccess(T t);
    public void onFail(String error);
}
