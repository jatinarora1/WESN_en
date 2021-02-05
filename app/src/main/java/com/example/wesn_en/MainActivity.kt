package com.example.wesn_en

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = Data.genData(15)
        val dataAdapter = DataAdapter(data)
        rvData.layoutManager = LinearLayoutManager(this)
        rvData.adapter = dataAdapter
        rvData.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

    }
}