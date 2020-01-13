package com.karayel.segmentedadapter.basic

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.karayel.segmentedadapter.R
import com.karayel.segmentedadapter.util.DummyObjCreator
import com.karayel.segmentedadapter.util.setup
import kotlinx.android.synthetic.main.activity_basic.*

class BasicAdapterActivity : AppCompatActivity() {

    private val basicAdapter by lazy {
        BasicAdapter(this, itemClickListener = object : BasicAdapterOnItemClickListener{
            override fun onItemClicked(itemName: String) {
                Toast.makeText(this@BasicAdapterActivity,itemName,Toast.LENGTH_LONG).show()
            }
        })
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
        return DummyObjCreator.getDummyUserList()
    }
}