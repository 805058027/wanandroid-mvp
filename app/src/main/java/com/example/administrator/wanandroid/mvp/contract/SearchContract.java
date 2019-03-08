package com.example.administrator.wanandroid.mvp.contract;

import com.example.administrator.wanandroid.base.BaseView;
import com.example.administrator.wanandroid.bean.BaseObjectBean;
import com.example.administrator.wanandroid.bean.HotKeyBean;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2019/3/7.
 */

public interface SearchContract {

    interface Model {
        Observable<BaseObjectBean<List<HotKeyBean>>> getHotKey();
    }

    interface View extends BaseView {
        @Override
        void showLoading();

        @Override
        void hideLoading();

        @Override
        void onError(Throwable throwable);

        void showHotKey(BaseObjectBean<List<HotKeyBean>> bean);
    }

    interface Presenter {
        void getHotKey();
    }

}
