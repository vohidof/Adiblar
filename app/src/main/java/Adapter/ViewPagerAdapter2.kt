package Adapter

import Fragments.JahonAdabiyotiFragment
import Fragments.MumtozAdabiyotFragment
import Fragments.OzbekAdabiyotiFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter2 (fragmentManager1: FragmentManager?): FragmentPagerAdapter(fragmentManager1!!) {
    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> MumtozAdabiyotFragment()
            1-> OzbekAdabiyotiFragment()
            2-> JahonAdabiyotiFragment()
            else -> MumtozAdabiyotFragment()
        }
    }

}