package com.wenke.ounew.module.news.view;

import com.wenke.ounew.base.BaseView;
import com.wenke.ounew.greendao.NewsChannelTable;

import java.util.List;

/**
 * Created by 范文轲 on 2017/8/8.
 */

/**
 * 新闻视图接口<p>
 */
public interface INewsView extends BaseView{

    void initViewPager(List<NewsChannelTable> newsChannels);

    void initRxBusEvent();
}
