package kr.co.tjoeun.viewpager_200818

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.viewpager_200818.Adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var mMainPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setValues() {
        mMainPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mMainPagerAdapter
    }

}
