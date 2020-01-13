package com.karayel.lib.segmented
 
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.karayel.lib.util.SectionObject
import java.util.*
import kotlin.collections.ArrayList

@Suppress("UNREACHABLE_CODE")
abstract class BaseSegmentedRecyclerAdapter<HeaderModel, TotalList : SectionObject<HeaderModel>>
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var sectionItemList : HashMap<HeaderModel, SortedMap<Any, TotalList>> = hashMapOf()
    private var sectionHeaders : List<HeaderModel> = arrayListOf()

    final override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 0) {
            onCreateHeaderViewHolder(parent)
        } else {
            onCreateSectionItemViewHolder(parent)
        }
    }

    final override fun getItemCount(): Int {
        return if (sectionItemList.isEmpty() || sectionHeaders.isEmpty()) {
            SECTION_FIRST_ITEM_INDEX
        } else {
            var size = SECTION_FIRST_ITEM_INDEX
            for (headerModel : HeaderModel in sectionHeaders) {
                size += sectionItemList[headerModel]!!.size
            }
            size += sectionHeaders.size
            size
        }
    }

    fun setDataSet(data: List<TotalList> , isSorted : Boolean = false) {
        this.sectionItemList = hashMapOf()
        addToDataList(data,isSorted)
    }

    final override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == SECTION_FIRST_ITEM_INDEX) {
            getHeader(position)?.let { onBindHeaderViewHolder(holder, it) }
        } else {
            getItem(position)?.let { onBindSectionItemViewHolder(holder, it) }
        }
    }

    private fun getHeader(position: Int): HeaderModel? {
        var size = 1
        for (headerModel : HeaderModel in sectionHeaders) {
            if (position == (size - 1)) {
                return headerModel
            }
            size += sectionItemList[headerModel]!!.size
            ++size
        }
        return null
    }

    private fun getItem(position: Int): TotalList? {
        var size = 1
        var pos: Int
        var obj: TotalList? = null
        for (headerModel: HeaderModel in sectionHeaders) {
            if (position >= size && position < (size + sectionItemList[headerModel]!!.size)) {
                pos = position - size
                val data = ArrayList(sectionItemList[headerModel]!!.values)
                obj = data[pos]
                break
            }
            size += sectionItemList[headerModel]!!.size
            ++size
        }
        return obj
    }

    /**
     *  Return value for the Header 0 and 1 for the Child
     */
    final override fun getItemViewType(position: Int): Int {
        var size = 1
        for (headerModel: HeaderModel in sectionHeaders) {
            if (position == (size - 1)) {
                return 0
            }
            size += sectionItemList[headerModel]!!.size
            ++size
        }
        return 1
    }


    /**
     * [Header][UniqueId] = Obj
     * Considering the sample project = [Fenerbahce][0] = Player(Serdar Aziz)
     * Both header sorting and sorting of items
     *
     */
    private fun addToDataList(@NonNull data: List<TotalList>, isSorted : Boolean) {
        if (data.isEmpty()) {
            // TODO : Warning state'll add
            return
        }
        for (totalList : TotalList in data) {
            sectionItemList.takeIf { it[totalList.getSectionObj()].isNullOrEmpty() }?.apply {
                sectionItemList[totalList.getSectionObj()] = TreeMap()
            }
            sectionItemList[totalList.getSectionObj()]!![totalList.getUniqueKey()] = totalList
        }

        sectionHeaders = ArrayList(sectionItemList.keys)

        if (sectionHeaders .size > 1 && isSorted) {
            Collections.sort(sectionHeaders) { a, b -> compareSections(a, b) }
        }
        notifyDataSetChanged()
    }

    protected open fun compareSections(o1: HeaderModel, o2: HeaderModel): Int {
        return o1.toString().compareTo(o2.toString(), ignoreCase = true)
    }

    fun removeFromData(obj: TotalList) {
        outer@for (index in sectionItemList.size-1 downTo 1 step 1){
            if (obj.getUniqueKey() == sectionItemList[obj.getSectionObj()]?.get(index)?.getUniqueKey()) {
                sectionItemList[obj.getSectionObj()]?.remove(index)
            }
        }
    }





    abstract fun onBindHeaderViewHolder(holder: RecyclerView.ViewHolder, obj: HeaderModel)

    abstract fun onCreateHeaderViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    abstract fun onBindSectionItemViewHolder(holder: RecyclerView.ViewHolder, obj: TotalList)

    abstract fun onCreateSectionItemViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    companion object{
        const val SECTION_FIRST_ITEM_INDEX = 0
    }

}