package dream.api.dmf.cn.dreaming.fragment.bigfragment;


import android.support.v4.app.Fragment;
import android.view.View;

import dream.api.dmf.cn.dreaming.R;
import dream.api.dmf.cn.dreaming.base.BaseMvpFragment;
import dream.api.dmf.cn.dreaming.base.mvp.Contract;
import dream.api.dmf.cn.dreaming.base.mvp.presenter.presenter;

public class BigBugFragment extends BaseMvpFragment<presenter> implements Contract.Iview {

    public static Fragment newInstance() {
        BigBugFragment fragment = new BigBugFragment();
        return fragment;
    }

    @Override
    protected presenter createPresenter() {
        return new presenter();
    }

    @Override
    protected int getFragmentView() {
        return R.layout.fragment_big_bug;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void getData() {

    }

    @Override
    public void getData(Object object) {

    }
}
