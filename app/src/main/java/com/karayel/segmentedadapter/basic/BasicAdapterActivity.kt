package com.karayel.segmentedadapter.basic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.karayel.segmentedadapter.R
import com.karayel.segmentedadapter.util.setup
import kotlinx.android.synthetic.main.activity_basic.*

class BasicAdapterActivity : AppCompatActivity() {

    private val basicAdapter by lazy {
        BasicAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)

        rv_basic.setup(this).apply {
            adapter = basicAdapter
        }

        basicAdapter.sendData(getData())
    }

    private fun getData(): List<BasicItemModel> {
        val dummyList = arrayListOf<BasicItemModel>()
        for (i in 0..10) {
            dummyList.add(
                BasicItemModel(
                    userName = "Gorkem Karayel",
                    userAge = 29,
                    userAvatarUrl = "https://i.pravatar.cc/150?img=3"
                )
            )
        }
        return dummyList
    }
}