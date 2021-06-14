package com.peculiaruc.newsblock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.peculiaruc.newsblock.adapter.PagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewpager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager2: ViewPager2 = findViewById(R.id.viewpager)
        val tabLayout: TabLayout = findViewById(R.id.tablayout)

        val fragAdapter  = PagerAdapter(this, supportFragmentManager,tabLayout.tabCount)
        viewPager2.adapter = fragAdapter


        //viewpager2.addOnT(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout.addOnTabSelectedListener(
            object : TabLayout.OnTabSelectedListener {

                override fun onTabSelected(tab: TabLayout.Tab) {
                    viewpager2.currentItem = tab.position
                }
                override fun onTabUnselected(tab: TabLayout.Tab) {

                }
                override fun onTabReselected(tab: TabLayout.Tab) {

                }
            }
        )
    }

//        tabLayout.setupWithViewPager(viewPager2)
//
//        TabLayoutMediator(tabLayout, viewPager2) {tab, position ->
//            tab.text = if(position == 0) {
//                getString(R.string.signin)}
//            else{
//                getString(R.string.signup)
//            }
//        }.attach()
//    }
//

}

private fun TabLayout.setupWithViewPager(viewPager: ViewPager2) {
    TODO("Not yet implemented")
}
