package com.appstallion.nestedrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.appstallion.nestedrecyclerview.databinding.ParentLayoutBinding

class ParentAdapter(private val listOfParentItems: MutableList<Data>) :
    RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {

    inner class ParentViewHolder(private val binding: ParentLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(parentData: Data) {
            binding.tvGroupName.text=parentData.groupName

            binding.rvChild.layoutManager=LinearLayoutManager(binding.root.context)
            //passing data for children inside the parent
            val childAdapter=ChildAdapter(parentData.items)
            binding.rvChild.adapter=childAdapter
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val binding = ParentLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return ParentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        holder.bind(listOfParentItems[position])
    }

    override fun getItemCount(): Int {
        return listOfParentItems.count()
    }
}