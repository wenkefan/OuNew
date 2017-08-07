package com.wenke.ounew.module.news.presenter;

import com.wenke.ounew.base.BasePresenterImpl;
import com.wenke.ounew.greendao.NewsChannelTable;
import com.wenke.ounew.module.news.view.INewsView;

import java.util.List;

/**
 * Created by 范文轲 on 2017/8/8.
 */

public class INewsPresenterImpl extends BasePresenterImpl<INewsView, List<NewsChannelTable>>
        implements INewsPresenter {


    public INewsPresenterImpl(INewsView view) {
        super(view);
    }

    @Override
    public void operateChannelDb() {

    }
}
