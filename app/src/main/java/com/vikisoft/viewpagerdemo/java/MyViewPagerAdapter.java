package com.vikisoft.viewpagerdemo.java;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    private List<String> pageTitleList;
    private Context context;


    public MyViewPagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList, List<String> pageTitleList , Context context) {
        super(fm);

        this.fragmentList = fragmentList;
        this.pageTitleList = pageTitleList;
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }


}
