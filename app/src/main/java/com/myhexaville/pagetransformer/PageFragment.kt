package com.myhexaville.pagetransformer


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val position = arguments.getInt("position")
        val layout = getLayout(position)
        val root = inflater?.inflate(layout, container, false)
        root?.tag = position
        return root
    }

    private fun getLayout(position: Int): Int {
        when (position) {
            0 -> return R.layout.fragment_page_one
            1 -> return R.layout.fragment_page_two
            else -> return R.layout.fragment_page_three
        }
    }

    companion object {
        fun newInstance(position: Int): PageFragment {
            val args = Bundle()
            args.putInt("position", position)
            val fragment = PageFragment()
            fragment.arguments = args
            return fragment
        }
    }

}
