package com.peculiaruc.newsblock.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayoutMediator
import com.peculiaruc.newsblock.MainActivity
import com.peculiaruc.newsblock.R


class MainFragment : Fragment() {

    var titles = arrayOf("SignIn", "SignUp")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    //    setupViewPage(viewPager = setupViewPage(ViewPager))
    }

    private fun setupViewPage(viewPager: Unit) {
        TODO("Not yet implemented")
    }
    
}