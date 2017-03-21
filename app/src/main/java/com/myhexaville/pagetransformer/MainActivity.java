package com.myhexaville.pagetransformer;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;

import com.myhexaville.pagetransformer.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbar);
        binding.pager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        binding.pager.setPageTransformer(false, new PageTransformer());

        setupPageDivider(binding);
    }

    private void setupPageDivider(ActivityMainBinding binding) {
        int px = Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2f, getResources().getDisplayMetrics()));
        binding.pager.setPageMargin(px);
        binding.pager.setPageMarginDrawable(R.color.divider);
    }
}