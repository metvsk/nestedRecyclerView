package com.appstallion.nestedrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.appstallion.nestedrecyclerview.databinding.ChildLayoutBinding

class ChildAdapter(private val listOfChildren: MutableList<String>) :
    RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    inner class ChildViewHolder(private val binding: ChildLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(childName:String) {
            binding.textView.text=childName
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val binding = ChildLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return ChildViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.bind(listOfChildren[position])
    }

    override fun getItemCount(): Int {
        return listOfChildren.count()
    }
}