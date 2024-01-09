package com.example.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homwork2l.data.model.Lakcross
import com.example.homwork2l.databinding.ItemLakcrossBinding

class LakcrossAdapters : RecyclerView.Adapter<LakcrossAdapters.SoccerViewHolder>() {
    private var soccerList = mutableListOf<Lakcross>()

    fun setSoccerList(soccerList: MutableList<Lakcross>) {
        this.soccerList.clear()
        this.soccerList.addAll(soccerList)
        notifyDataSetChanged()
    }

    inner class SoccerViewHolder(private val binding: ItemLakcrossBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind( lakcross: Lakcross  ) {
            binding.lakcoss.setImageResource(lakcross.image)
            binding.name.text = lakcross.name
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LakcrossAdapters.SoccerViewHolder {
        return SoccerViewHolder(
            ItemLakcrossBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return soccerList.size
    }


    override fun onBindViewHolder(holder: LakcrossAdapters.SoccerViewHolder, position: Int) {
        holder.onBind(soccerList[position])
    }
}
