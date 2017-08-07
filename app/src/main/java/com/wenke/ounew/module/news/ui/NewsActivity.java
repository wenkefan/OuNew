package com.wenke.ounew.module.news.ui;

import com.wenke.ounew.R;
import com.wenke.ounew.annotation.ActivityFragmentInject;
import com.wenke.ounew.app.AppManager;
import com.wenke.ounew.base.BaseActivity;
import com.wenke.ounew.greendao.NewsChannelTable;
import com.wenke.ounew.module.news.presenter.INewsPresenter;
import com.wenke.ounew.module.news.view.INewsView;
import com.wenke.ounew.utils.ViewUtil;

import java.util.List;

@ActivityFragmentInject(
        contentViewId = R.layout.activity_news
)
public class NewsActivity extends BaseActivity<INewsPresenter> implements INewsView {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }

    @Override
    protected void initView() {
        getWindow().setBackgroundDrawable(null);

        ViewUtil.quitFullScreen(this);

        AppManager.getAppManager().orderNavActivity(getClass().getName(),false);

//        mPresenter = new
    }

    @Override
    public void initViewPager(List<NewsChannelTable> newsChannels) {

    }

    @Override
    public void initRxBusEvent() {

    }
}
