package com.kaibalya.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val item= fetchData()
        val adapter = NewsListAdapter(item, this)
        recyclerView.adapter = adapter

    }
    private fun fetchData(): java.util.ArrayList<String>{
        val list = ArrayList<String>()
        for (l in list){
            list.add("item $l")
        }
        return list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this, "clicked item is $item", Toast.LENGTH_SHORT).show()
    }
}