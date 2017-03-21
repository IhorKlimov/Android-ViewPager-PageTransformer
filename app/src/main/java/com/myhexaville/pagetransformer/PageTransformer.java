package com.myhexaville.pagetransformer;

import android.support.v4.view.ViewPager;
import android.view.View;


public class PageTransformer implements ViewPager.PageTransformer {
    private View firstImage, secondImage, thirdImage;

    @Override
    public void transformPage(View page, float position) {
        int pageWidth = page.getWidth();

        if ((int) page.getTag() == 0) {
            firstImage = page.findViewById(R.id.image_one);
            firstImage.setTranslationX(-position * (pageWidth / 2));
        }
        if ((int) page.getTag() == 1) {
            secondImage = page.findViewById(R.id.image_two);
            secondImage.setTranslationX(-position * (pageWidth / 2));
        }
        if ((int) page.getTag() == 2) {
            thirdImage = page.findViewById(R.id.image_three);
            thirdImage.setTranslationX(-position * (pageWidth / 2));
        }
    }
}