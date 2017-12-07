package com.example.mvpdemo.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.mvpdemo.mvp.demo5.RequestPresenter5;
import com.example.mvpdemo.mvp.demo5.RequestView5;
import com.example.mvpdemo.mvp.request.WeatherBean;
import com.example.mvpdemo.mvpframework.factory.CreatePresenter;
import com.example.mvpdemo.mvpframework.view.AbstractMvpActivitiy;


/**
 * @author 马
 * @date 2017/11/23
 * @description
 */
@CreatePresenter(RequestPresenter5.class)
public class SecondActivity extends AbstractMvpActivitiy<RequestView5, RequestPresenter5> implements RequestView5{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void requestLoading() {

    }

    @Override
    public void resultSuccess(WeatherBean result) {

    }

    @Override
    public void resultFailure(String result) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
