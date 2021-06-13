package com.peculiaruc.newsblock.adapter

import androidx.fragment.app.*
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(activity: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(activity) {

    private val mFragmentList: MutableList<Fragment> = ArrayList()
    private val mFragmentTitleList: MutableList<String> = ArrayList()


    fun addFragment(fragment: Fragment, title: String) {
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

    override fun getItemCount(): Int {
        return mFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return mFragmentList[position]
    }
//
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