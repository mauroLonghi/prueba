package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.myapplication.adapters.RecyclerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myrv = findViewById(R.id.recyclerGridLayout) as RecyclerView

        val myAdapter = RecyclerAdapter()
        myrv.layoutManager = GridLayoutManager(this, 3)
        //myrv.setLayoutManager(new LinearLayoutManager(this));
        myrv.adapter = RecyclerAdapter()
    }
    fun generateButtons():List<String>{
        val listOfNumber = mutableListOf<String>()

        listOfNumber.add("1")
        listOfNumber.add("2")
        listOfNumber.add("3")
        listOfNumber.add("4")
        listOfNumber.add("5")
        listOfNumber.add("6")
        listOfNumber.add("7")
        listOfNumber.add("8")
        listOfNumber.add("9")
        listOfNumber.add("0")
        return listOfNumber
    }
}
