package com.wenke.ounew.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wenke.ounew.R;
import com.wenke.ounew.annotation.ActivityFragmentInject;

/**
 * Created by wenke on 2017/8/7.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    protected int mContentViewId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getClass().isAnnotationPresent(ActivityFragmentInject.class)){
            ActivityFragmentInject annmtation = getClass().getAnnotation(ActivityFragmentInject.class);
            mContentViewId = annmtation.contentViewId();
        } else {
            throw new RuntimeException("Class must add annotations of ActivityFragmentInitParams.class");
        }

        setContentView(mContentViewId);

        initToolbar();

        initView();
    }

    private void initToolbar(){
//        View statusView = findViewById(R.id.status_view);
    }

    protected abstract void initView();
}
