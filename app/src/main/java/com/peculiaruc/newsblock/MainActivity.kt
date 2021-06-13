package com.peculiaruc.newsblock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.peculiaruc.newsblock.adapter.PagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewpager)
        val tabLayout: TabLayout = findViewById(R.id.tablayout)

        val fragAdapter  = PagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = fragAdapter

        tabLayout.setupWithViewPager(viewPager)
        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            tab.text = if(position == 0) {
                getString(R.string.tab_text_1)}
            else{
                getString(R.string.tab_text_2)
            }
        }.attach()
    }


}

private fun TabLayout.setupWithViewPager(viewPager: ViewPager2) {
    TODO("Not yet implemented")
}
