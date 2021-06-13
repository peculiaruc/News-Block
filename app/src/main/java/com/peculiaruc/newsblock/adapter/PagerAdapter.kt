package com.peculiaruc.newsblock.adapter

import androidx.fragment.app.*
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.peculiaruc.newsblock.fragment.SignInFragment
import com.peculiaruc.newsblock.fragment.SignUpFragment

class PagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){


    override fun getItem(position: Int): Fragment {
        return when (position){
           0-> {
              SignInFragment()
           }else -> {
               return SignUpFragment()
            }
        }
    }

    override fun getCount(): Int {
     return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "SignIn"
            else -> {
                return "SignUp"
            }
        }
    }


}