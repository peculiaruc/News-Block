package com.peculiaruc.newsblock.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.peculiaruc.newsblock.MainActivity
import com.peculiaruc.newsblock.R


class MainFragment : Fragment() {

//  var tabLayout: TabLayout? = null
//    var viewPager2: ViewPager2? = null

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val fragAdapter = PagerAdapter(supportFragmentManager)
        viewPager2?.adapter = fragAdapter

        tabLayout?.setupWithViewPager(viewPager2)

        //alternatvie logic
//        TabLayoutMediator(tabLayout, viewPager2) {tab, position ->
//            tab.text = "${position + 1}"
//        }.attach()
//
//        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                Toast.makeText(this@MainFragment, "Tab ${tab?.text} selected", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                Toast.makeText(this@MainFragment, "Tab ${tab?.text} unselected", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//                Toast.makeText(this@MainFragment, "Tab ${tab?.text} reselected", Toast.LENGTH_SHORT).show()
//            }
//        })

    }


}