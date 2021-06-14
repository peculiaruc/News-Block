package com.peculiaruc.newsblock.adapter

import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.peculiaruc.newsblock.fragment.SignInFragment
import com.peculiaruc.newsblock.fragment.SignUpFragment

class PagerAdapter(
    activity: FragmentActivity,
    supportFragmentManager: FragmentManager,
    private val tabCount: Int
): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
       return tabCount
    }

    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> {
                return SignUpFragment()
            }else -> {
            return SignInFragment()
            }
        }
    }


//    override fun getItem(position: Int): Fragment {
//        return when (position){
//           0-> {
//              SignInFragment()
//           }else -> {
//               return SignUpFragment()
//            }
//        }
//    }
//
//    override fun getCount(): Int {
//     return 2
//    }
//
//    override fun getPageTitle(position: Int): CharSequence? {
//        return when (position) {
//            0 -> "SignIn"
//            else -> {
//                return "SignUp"
//            }
//        }
//    }
//

}