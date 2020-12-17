package com.example.day3lian1.utils;

public interface INetWorkInterface {
    public <T> void get(String url,INetCallBack<T> callBack);
}
