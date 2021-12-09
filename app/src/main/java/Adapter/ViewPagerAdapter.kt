package Adapter

import Fragments.AdiblarFragment
import Fragments.SaqlanganFragment
import Fragments.SettingsFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {

        return when (position) {

            0 -> {
                AdiblarFragment()
            }
            1 -> {
                SaqlanganFragment()
            }
            else -> {
                SettingsFragment()
            }

        }
    }
}