package kr.co.tjoeun.viewpager_200818.Adapters

import android.icu.text.Transliterator
import android.telephony.PhoneNumberFormattingTextWatcher
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_200818.Fragments.AddFragment
import kr.co.tjoeun.viewpager_200818.Fragments.NameFragment
import kr.co.tjoeun.viewpager_200818.Fragments.PhoneNumFragment

class MainViewPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm){

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "이름"
            1 -> "폰번"
            else -> "주소"
        }
    }

    override fun getItem(position: Int): Fragment{

        return when(position){
            0 -> NameFragment()
            1 -> PhoneNumFragment()
            else -> AddFragment()
        }
    }

    override fun getCount():Int{
        return 3
    }


}