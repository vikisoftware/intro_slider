package com.vikisoft.viewpagerdemo.kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vikisoft.viewpagerdemo.R

public class FirstFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return getView(layoutInflater, container, R.layout.fragment_screen_one)
    }
}

public class SecondFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return getView(layoutInflater, container, R.layout.fragment_screen_two)
    }
}

public class ThirdFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return getView(layoutInflater, container, R.layout.fragment_screen_three)
    }
}

fun getView(layoutInflater: LayoutInflater, container: ViewGroup?, layout: Int) : View = layoutInflater.inflate(layout, container, false)