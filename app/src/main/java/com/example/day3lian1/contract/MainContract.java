package com.example.day3lian1.contract;

import com.example.day3lian1.base.BaseView;
import com.example.day3lian1.bean.MainBean;
import com.example.day3lian1.utils.INetCallBack;

public class MainContract {
    public interface IMainView extends BaseView{
        void success(MainBean mainBean);
        void error(String error);
    }

    public interface IMainPresenter{
        void getSuccess();
        void getError(String error);
    }

    public interface IMainModel{
        <T> void onGet(String url, INetCallBack<T> iNetCallBack);
    }
}
