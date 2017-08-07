package com.wenke.ounew.module.news.ui;

import android.os.Bundle;

import com.wenke.ounew.R;
import com.wenke.ounew.annotation.ActivityFragmentInject;
import com.wenke.ounew.base.BaseActivity;

@ActivityFragmentInject(
        contentViewId = R.layout.activity_main
)
public class NewsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {

    }
}
