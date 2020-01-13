package com.karayel.segmentedadapter.util

import android.annotation.SuppressLint
import android.content.Context
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * RecyclerView Setup before set Adapter
 * */
@SuppressLint("WrongConstant")
fun RecyclerView.setup(
    context: Context,
    hasAnimation: Boolean = false,
    orientation: Int = LinearLayoutManager.VERTICAL
): RecyclerView {

    val layoutManager = LinearLayoutManager(context)
    if (hasAnimation) this.itemAnimator = DefaultItemAnimator()
    layoutManager.orientation = orientation
    this.layoutManager = layoutManager
    this.setHasFixedSize(true)
    return this
}