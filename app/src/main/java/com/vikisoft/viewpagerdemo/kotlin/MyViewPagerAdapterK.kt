package com.vikisoft.viewpagerdemo.kotlin

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

public class MyViewPagerAdapterK(
        var fm: FragmentManager,
        var fragmentList: List<Fragment>,
        var context: Context
) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }
}