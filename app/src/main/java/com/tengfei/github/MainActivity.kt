package com.tengfei.github

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tengfei.mvp.impl.BaseFragment
import com.tengfei.mvp.impl.BasePresenter
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainFragment = MainFragment()

        Log.i("tmd",mainFragment.toString())
        Log.i("tmd",mainFragment.presenter.toString())
        Log.i("tmd",mainFragment.presenter.view.toString())
    }
}

class MainPresenter : BasePresenter<MainFragment>() {}

class MainFragment: BaseFragment<MainPresenter>() {}