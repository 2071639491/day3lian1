package com.example.day3lian1.presenter;

import com.example.day3lian1.base.BasePresenter;
import com.example.day3lian1.bean.MainBean;
import com.example.day3lian1.contract.MainContract;
import com.example.day3lian1.model.MainModel;
import com.example.day3lian1.utils.INetCallBack;

public class MainPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {
    private MainContract.IMainModel iMainModel;

    public MainPresenter(MainContract.IMainView iMainView) {
        iMainModel=new MainModel(this);
    }

    @Override
    public void getSuccess() {
        iMainModel.onGet("http://cdwan.cn:7000/exam2003/astudent.json", new INetCallBack<MainBean>() {
            @Override
            public void onSuccess(MainBean mainBean) {
                iView.success(mainBean);
            }

            @Override
            public void onFail(String error) {

            }
        });
    }

    @Override
    public void getError(String error) {

    }
}
