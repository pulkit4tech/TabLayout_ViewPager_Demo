package com.pulkit4tech.tablayout.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.pulkit4tech.tablayout.fragement.Overview;
import com.pulkit4tech.tablayout.fragement.Review;
import com.pulkit4tech.tablayout.fragement.Trailer;

/**
 * Created by PULKIT on 4/1/2016.
 */
public class MyPageAdapter extends FragmentStatePagerAdapter{

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0 : fragment = new Overview();break;
            case 1 : fragment = new Trailer();break;
            case 2 : fragment = new Review();break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        //here 3 but can be dynamic
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title=" ";
        switch (position){
            case 0:
                title="Overview";
                break;
            case 1:
                title="Trailer";
                break;
            case 2:
                title="Reviews";
                break;
        }

        return title;
    }
}
