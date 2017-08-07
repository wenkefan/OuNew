package com.wenke.ounew.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wenke on 2017/8/7.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ActivityFragmentInject {
    /**
     * 顶布局的ID
     * @return
     */
    int contentViewId() default -1;

    /**
     * 菜单ID
     * @return
     */
    int menuId() default -1;

    /**
     * 是否开启侧滑
     * @return
     */
    boolean enableSlidr() default false;

    /**
     * 是否存在NavigationView
     * @return
     */
    boolean hasNavigationView() default false;

    /**
     * 是否处理RefreshLayout，对应父布局为CoordinateLayout加AppbarLayout与RefreshLayout造成的事件冲突
     * @return
     */
    boolean handleRefreshLayout() default false;

    /**
     * tooble的标题id
     * @return
     */
    int toolbarTitle() default -1;

    /**
     * tooble的菜单按钮
     * @return
     */
    int toolbarIndicator() default -1;

    /**
     * tooblar菜单默认选中项
     * @return
     */
    int menuDefaultCheckedItem() default -1;
}
