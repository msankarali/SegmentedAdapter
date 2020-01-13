package com.karayel.lib.segmented
 
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.karayel.lib.util.SectionObject
import java.util.*
import kotlin.collections.ArrayList

abstract class BaseSegmentedRecyclerAdapter<HeaderModel, TotalList : SectionObject<HeaderModel>>(data: List<TotalList> = emptyList())
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var dataSet: HashMap<HeaderModel, SortedMap<Any, TotalList>> = hashMapOf()
    private var keys: List<HeaderModel>? = null

    final override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 0) {
            onCreateHeaderViewHolder(parent)
        } else {
            onCreateSectionItemViewHolder(parent)
        }
    }

    final override fun getItemCount(): Int {
        return if (dataSet.isEmpty() || keys == null || keys!!.isEmpty()) {
            0
        } else {
            var size = 0
            for (headerModel : HeaderModel in keys!!) {
                size += dataSet[headerModel]!!.size
            }
            size += keys!!.size
            size
        }
    }

    final override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == 0) {
            onBindHeaderViewHolder(holder, getHeaderObj(position))
        } else {
            onBindSectionItemViewHolder(holder, getItem(position))
        }
    }

    private fun getHeaderObj(position: Int): HeaderModel {
        var size = 1
        for (headerModel : HeaderModel in keys!!) {
            if (position == (size - 1)) {
                return headerModel
            }
            size += dataSet[headerModel]!!.size
            ++size
        }
        return null!!
    }

    private fun getItem(position: Int): TotalList {
        var size = 1
        var pos = 0
        var obj: TotalList? = null
        for (headerModel: HeaderModel in keys!!) {
            if (position >= size && position < (size + dataSet[headerModel]!!.size)) {
                pos = position - size
                val data = ArrayList(dataSet[headerModel]!!.values)
                obj = data[pos]
                break
            }
            size += dataSet[headerModel]!!.size
            ++size
        }
        return obj!!
    }

    final override fun getItemViewType(position: Int): Int {
        var size: Int = 1
        for (headerModel: HeaderModel in keys!!) {
            if (position == (size - 1)) {
                return 0
            }
            size += dataSet[headerModel]!!.size
            ++size
        }
        return 1
    }

    fun addToData(@NonNull obj: TotalList?) {
        if (obj == null) {
            return
        }
        if (dataSet[obj.getSectionObj()] == null) {
            dataSet[obj.getSectionObj()] = TreeMap()
        }
        dataSet[obj.getSectionObj()]!![obj.getUniqueKey()] = obj
        keys = ArrayList(dataSet.keys)
        if (keys!!.size > 1) {
            Collections.sort(keys!!) { a, b -> compareSections(a, b) }
        }
        if (dataSet[obj.getSectionObj()] != null && dataSet[obj.getSectionObj()]!!.size > 1) {
            dataSet[obj.getSectionObj()] = dataSet[obj.getSectionObj()]!!.toSortedMap(sectionaldatasortComparator(obj.getSectionObj()))
        }
        notifyDataSetChanged()
    }

    fun setDataSet(data: List<TotalList>) {
        this.dataSet = hashMapOf()
        addToData(data)
    }

    private fun addToData(@NonNull data: List<TotalList>) {
        if (data.isEmpty()) {
            return
        }
        for (totalList : TotalList in data) {
            if (dataSet[totalList.getSectionObj()] == null) {
                dataSet[totalList.getSectionObj()] = TreeMap()
            }
            dataSet[totalList.getSectionObj()]!![totalList.getUniqueKey()] = totalList
        }
        keys = ArrayList(dataSet.keys)
        if (keys!!.size > 1) {
            Collections.sort(keys!!) { a, b -> compareSections(a, b) }
        }
        for (headerModel : HeaderModel in keys!!) {
            if (dataSet[headerModel] != null && dataSet[headerModel]!!.size > 1) {
                dataSet[headerModel] = dataSet[headerModel]!!.toSortedMap(sectionaldatasortComparator(headerModel))
            }
        }
        notifyDataSetChanged()
    }

    protected open fun compareSections(o1: HeaderModel, o2: HeaderModel): Int {
        return o1.toString().compareTo(o2.toString(), ignoreCase = true)
    }

    protected open fun compareSectionItems(a: TotalList, b: TotalList): Int {
        return a.getUniqueKey().toString().compareTo(b.getUniqueKey().toString(), ignoreCase = true)
    }

    private fun sectionaldatasortComparator(key: HeaderModel): Comparator<Any> {
        return Comparator { a, b -> compareSectionItems(dataSet[key]!![a]!!, dataSet[key]!![b]!!) }
    }

    fun removeFromData(obj: TotalList) {
        if (dataSet.isNotEmpty()) {
            dataSet[obj.getSectionObj()]!!.remove(obj.getUniqueKey())
            notifyDataSetChanged()
        }
    }

    abstract fun onBindHeaderViewHolder(holder: RecyclerView.ViewHolder, obj: HeaderModel)

    abstract fun onCreateHeaderViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    abstract fun onBindSectionItemViewHolder(holder: RecyclerView.ViewHolder, obj: TotalList)

    abstract fun onCreateSectionItemViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
}