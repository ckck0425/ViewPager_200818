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
        if (position==0){
            return "이름"
        }
        else if (position==1){
            return "폰번"
        }
        else {
            return "주소"
        }
    }

    override fun getItem(position: Int): Fragment{

        if (position==0) {
            return NameFragment()
        }

        else if (position==1){
            return PhoneNumFragment()
        }
        else {
            return AddFragment()
        }

    }

    override fun getCount():Int{
        return 3
    }


}