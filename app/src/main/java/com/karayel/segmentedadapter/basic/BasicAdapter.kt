package com.karayel.segmentedadapter.basic

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.karayel.lib.basic.BaseRecyclerAdapter
import com.karayel.segmentedadapter.R
import com.karayel.segmentedadapter.databinding.ItemBasicBinding

class BasicAdapter(
    private var context: Context,
    itemList: List<BasicItemModel> = emptyList()
) : BaseRecyclerAdapter<BasicItemModel, ItemBasicBinding>() {

    init {
        this.items = itemList
    }

    override fun createBinding(parent: ViewGroup): ItemBasicBinding {
        return DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_basic, parent, false
        )
    }

    override fun bind(binding: ItemBasicBinding, item: BasicItemModel?, position: Int) {
        item?.let {
            binding.tvUserName.text = it.userName
            binding.tvUserAge.text = it.userAge.toString()
            Glide.with(context).load(it.userAvatarUrl).into(binding.ivUserAvatar)
        }
    }

    override fun sendData(items: List<BasicItemModel>, extraData: Any?) {
        this.items = items
        notifyDataSetChanged()
    }
}
