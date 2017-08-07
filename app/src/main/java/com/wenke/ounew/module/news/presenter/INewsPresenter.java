package com.wenke.ounew.module.news.presenter;

import com.wenke.ounew.base.BasePresenter;

/**
 * Created by 范文轲 on 2017/8/8.
 */

/**
 * 新闻代理接口<p>
 */
public interface INewsPresenter extends BasePresenter{

    /**
     * 频道排序或增删变化后调用此方法更新数据库
     */
    void operateChannelDb();

}
