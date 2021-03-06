package com.peakmain.basicui.activity.home.recylcer.itemDecoration;

import android.content.Context;

import com.peakmain.basicui.activity.home.recylcer.bean.GroupBean;
import com.peakmain.ui.recyclerview.itemdecoration.BaseSuspenisonItemDecoration;

import java.util.List;

/**
 * author ：Peakmain
 * createTime：2020/3/23
 * mail:2726449200@qq.com
 * describe：
 */
public class SuspenisonItemDecoration extends BaseSuspenisonItemDecoration<GroupBean> {

    public SuspenisonItemDecoration(BaseSuspenisonItemDecoration.Builder builder) {
        super(builder);
    }
    public SuspenisonItemDecoration(Context context, List<GroupBean> data) {
        super(context, data);
    }

    @Override
    public String getTopText(List<GroupBean> data, int position) {
        return data.get(position).getTime();
    }
    public static class Builder extends BaseSuspenisonItemDecoration.Builder<GroupBean> {
        public Builder(Context context, List<GroupBean> data) {
            super(context, data);
        }

        @Override
        public BaseSuspenisonItemDecoration create() {
            return new SuspenisonItemDecoration(this);
        }
    }
}
