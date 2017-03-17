package com.myhexaville.pagetransformer

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.databinding.DataBindingUtil

import com.myhexaville.pagetransformer.databinding.ActivityMainBinding
import android.util.TypedValue




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        setSupportActionBar(binding.toolbar)
        binding.pager.adapter =  PagerAdapter(supportFragmentManager)
        binding.pager.setPageTransformer(false, PageTransformer())

        setupPageDivider(binding)
    }

    private fun setupPageDivider(binding: ActivityMainBinding) {
        val px = Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2f, resources.displayMetrics))
        binding.pager.pageMargin = px
        binding.pager.setPageMarginDrawable(R.color.divider)
    }

}