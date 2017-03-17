package com.myhexaville.pagetransformer

import android.support.v4.view.ViewPager
import android.view.View


class PageTransformer : ViewPager.PageTransformer {
    var firstImage: View? = null
    var secondImage: View? = null
    var thirdImage: View? = null

    override fun transformPage(page: View?, position: Float) {
        val pageWidth = page?.width ?: return

        if (page.tag == 0) {
            firstImage = page.findViewById(R.id.image_one)
            firstImage?.translationX = -position * (pageWidth / 2)
        }
        if (page.tag == 1) {
            secondImage = page.findViewById(R.id.image_two)
            secondImage?.translationX = -position * (pageWidth / 2)
        }
        if (page.tag == 2) {
            thirdImage = page.findViewById(R.id.image_three)
            thirdImage?.translationX = -position * (pageWidth / 2)
        }
    }
}