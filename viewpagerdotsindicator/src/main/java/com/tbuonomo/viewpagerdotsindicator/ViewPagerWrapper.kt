package com.tbuonomo.viewpagerdotsindicator

import android.database.DataSetObserver
import androidx.viewpager.widget.ViewPager

class ViewPagerWrapper(private val viewPager: ViewPager) : ViewPagerInterface {

    override val hasAdapter: Boolean
        get() = viewPager.adapter != null

    override val count: Int
        get() = viewPager.adapter?.count ?: 0

    override val currentItem: Int
        get() = viewPager.currentItem

    override fun setCurrentItem(position: Int, smoothScroll: Boolean) {
        viewPager.setCurrentItem(position, smoothScroll)
    }

    override fun removeOnPageChangeListener(onPageChangeListenerHelper: OnPageChangeListenerHelper) {
        viewPager.removeOnPageChangeListener(onPageChangeListenerHelper)
    }

    override fun addOnPageChangeListener(onPageChangeListenerHelper: OnPageChangeListenerHelper) {
        viewPager.addOnPageChangeListener(onPageChangeListenerHelper)
    }

    override fun registerDataSetObserver(dataSetObserver: DataSetObserver) {
        viewPager.adapter?.registerDataSetObserver(dataSetObserver)
    }
}