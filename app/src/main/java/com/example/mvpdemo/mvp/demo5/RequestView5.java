package com.example.mvpdemo.mvp.demo5;


import com.example.mvpdemo.mvp.request.WeatherBean;
import com.example.mvpdemo.mvpframework.view.BaseMvpView;

/**
 * @author 马
 * @date 2017/11/17
 * @description
 */
public interface RequestView5 extends BaseMvpView {
    void requestLoading();
    void resultSuccess(WeatherBean result);
    void resultFailure(String result);
}
