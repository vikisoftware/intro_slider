package com.vikisoft.viewpagerdemo.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.vikisoft.viewpagerdemo.R
import com.vikisoft.viewpagerdemo.kotlin.FirstFragment
import com.vikisoft.viewpagerdemo.kotlin.SecondFragment
import com.vikisoft.viewpagerdemo.kotlin.ThirdFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityK : AppCompatActivity() {

    private val fragmentList = listOf<Fragment>(FirstFragment(), SecondFragment(), ThirdFragment())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViewpager()
    }

    private fun setViewpager() {
        val viewPagerAdapter = MyViewPagerAdapterK(supportFragmentManager, fragmentList, this)
        view_pager.adapter = viewPagerAdapter
        tab_layout.setupWithViewPager(view_pager)
    }
}