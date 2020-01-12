package com.karayel.lib.core

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.karayel.lib.R

abstract class BaseRecyclerAdapter<T, V : ViewDataBinding> :
    RecyclerView.Adapter<BaseViewHolder<V>>() {

    protected lateinit var items : List<T>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<V> {
        val binding : V = createBinding(parent)
        return BaseViewHolder(binding)
    }

    abstract fun createBinding(parent: ViewGroup): V

    override fun onBindViewHolder(holder: BaseViewHolder<V>, position: Int) {
        holder.binding.root.setTag(R.string.item_position,position)
        bind(holder.binding, items[position],position)
    }

    abstract fun bind(binding: V, item: T? , position: Int)

    override fun getItemCount(): Int {
        if (!items.isNullOrEmpty())
            return items.size
        return DEFAULT_ITEM_SIZE
    }

    abstract fun sendData(items: List<T>,extraData : Any? = null)

    fun getPositionBaseOnTag(theTag: Any?): Int {
        val length = items.size
        for (i in 0..length) {
            if (items[i] == theTag) {
                return i
            }
        }
        return POSITION_ITEM_NONNULL
    }

    companion object{
        const val DEFAULT_ITEM_SIZE = 0
        const val POSITION_ITEM_NONNULL = -1
    }
}