package com.myhexaville.pagetransformer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PageFragment extends Fragment {
    public static PageFragment newInstance(int position) {
        Bundle args = new Bundle();
        args.putInt("position", position);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int position = getArguments().getInt("position");
        int layout = getLayout(position);
        View root = inflater.inflate(layout, container, false);
        root.setTag(position);
        return root;
    }

    private int getLayout(int position) {
        switch (position) {
            case 0:
                return R.layout.fragment_page_one;
            case 1:
                return R.layout.fragment_page_two;
            default:
                return R.layout.fragment_page_three;
        }
    }
}
