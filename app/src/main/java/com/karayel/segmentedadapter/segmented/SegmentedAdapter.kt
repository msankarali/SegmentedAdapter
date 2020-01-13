package com.karayel.segmentedadapter.segmented

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.karayel.lib.segmented.BaseSegmentedRecyclerAdapter
import com.karayel.segmentedadapter.R
import com.karayel.segmentedadapter.databinding.ItemSectionChildBinding
import com.karayel.segmentedadapter.databinding.ItemSectionHeaderBinding
import de.hdodenhof.circleimageview.CircleImageView

class SegmentedAdapter(var context : Context) : BaseSegmentedRecyclerAdapter<Team,TeamPlayerModel>(){

    override fun onBindHeaderViewHolder(holder: RecyclerView.ViewHolder, obj: Team) {
        (holder as HeaderViewHolder).tvTeamName.text = obj.name
    }

    override fun onCreateHeaderViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val binding = DataBindingUtil.inflate<ItemSectionHeaderBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_section_header, parent, false)

        return HeaderViewHolder(binding.root)
    }

    override fun onBindSectionItemViewHolder(holder: RecyclerView.ViewHolder, obj: TeamPlayerModel) {
        (holder as ChildViewHolder).tvPlayerName.text = obj.playerName
        holder.tvPlayerPosition.text = obj.playerPosition.name
        holder.tvPlayerAge.text = obj.playerAge.toString()
        Glide.with(context).load(obj.teamLogoUrl).into(holder.tvPlayerAvatar)
    }

    override fun onCreateSectionItemViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val binding = DataBindingUtil.inflate<ItemSectionChildBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_section_child, parent, false)

        return ChildViewHolder(binding.root)
    }

    internal inner class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvTeamName = itemView.findViewById<AppCompatTextView>(R.id.tv_team_name)
    }

    internal inner class ChildViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val tvPlayerName  = itemView.findViewById<AppCompatTextView>(R.id.tv_team_player_name)
        val tvPlayerAge  = itemView.findViewById<AppCompatTextView>(R.id.tv_team_player_age)
        val tvPlayerPosition  = itemView.findViewById<AppCompatTextView>(R.id.tv_team_player_position)
        val tvPlayerAvatar = itemView.findViewById<CircleImageView>(R.id.iv_team_avatar)
    }
}