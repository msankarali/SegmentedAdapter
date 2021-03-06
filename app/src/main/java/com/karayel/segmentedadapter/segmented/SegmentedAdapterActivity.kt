package com.karayel.segmentedadapter.segmented

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.karayel.segmentedadapter.R
import com.karayel.segmentedadapter.util.DummyObjCreator
import com.karayel.segmentedadapter.util.setup
import kotlinx.android.synthetic.main.activity_segmented.*

class SegmentedAdapterActivity  : AppCompatActivity(){

    private val segmentedAdapter by lazy {
        SegmentedAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segmented)

        rv_segmented.setup(this).apply {
            adapter = segmentedAdapter
        }

        segmentedAdapter.setDataSet(getData(),isSorted = false)
    }

    private fun getData(): List<TeamPlayerModel> {
        return DummyObjCreator.getDummyPlayerList()
    }
}
