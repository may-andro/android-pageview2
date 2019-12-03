package com.mayandro.viewpager2demo.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.mayandro.viewpager2demo.R
import com.mayandro.viewpager2demo.databinding.ActivityHomeBinding
import com.mayandro.viewpager2demo.ui.base.BaseActivity
import timber.log.Timber

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeActivityViewModel>() {

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, HomeActivity::class.java)
        }
    }

    override fun getViewModelClass(): Class<HomeActivityViewModel> = HomeActivityViewModel::class.java

    override fun layoutId(): Int = R.layout.activity_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Timber.d("isonline activity")
    }
}
