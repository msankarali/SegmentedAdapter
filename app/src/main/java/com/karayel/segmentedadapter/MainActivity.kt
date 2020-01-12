package com.karayel.segmentedadapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.karayel.segmentedadapter.basic.BasicAdapterActivity
import com.karayel.segmentedadapter.segmented.SegmentedAdapterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_basic.setOnClickListener {
            startActivity(Intent(this,BasicAdapterActivity::class.java))
        }

        btn_segmented.setOnClickListener {
            startActivity(Intent(this,SegmentedAdapterActivity::class.java))
        }
    }
}
