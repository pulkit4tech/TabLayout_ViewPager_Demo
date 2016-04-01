package com.pulkit4tech.tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.pulkit4tech.tablayout.adapter.MyPageAdapter;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.view_pager)
    ViewPager pager;
    @InjectView(R.id.tab_layout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        // Fragment Manager to add fragment in pager
        FragmentManager manager = getSupportFragmentManager();

        //binding pager with manager
        MyPageAdapter adapter = new MyPageAdapter(manager);

        //set adapter to pager
        pager.setAdapter(adapter);

        //set tablayout with viewpager
        tabLayout.setupWithViewPager(pager);

        //adding functionality to tab and viewpager
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        //Setting tabs from adapter
        tabLayout.setTabsFromPagerAdapter(adapter);
    }
}
