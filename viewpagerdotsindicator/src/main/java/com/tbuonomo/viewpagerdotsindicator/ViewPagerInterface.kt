package com.tbuonomo.viewpagerdotsindicator

import android.database.DataSetObserver

interface ViewPagerInterface {

    fun setCurrentItem(position: Int, smoothScroll: Boolean)

    fun removeOnPageChangeListener(onPageChangeListenerHelper: OnPageChangeListenerHelper)

    fun addOnPageChangeListener(onPageChangeListenerHelper: OnPageChangeListenerHelper)

    fun registerDataSetObserver(dataSetObserver: DataSetObserver)

    val hasAdapter: Boolean

    val count: Int

    val currentItem: Int
}