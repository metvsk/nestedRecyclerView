package com.appstallion.nestedrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.appstallion.nestedrecyclerview.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val parentAdapter=ParentAdapter(GroupData.getData())
        binding.rvParent.adapter=parentAdapter
        binding.rvParent.layoutManager=LinearLayoutManager(this)
    }
}