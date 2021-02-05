package com.example.wesn_en

import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_layout.view.*
lateinit var context: Context
class DataAdapter(
    val data: ArrayList<Data>
): RecyclerView.Adapter<DataAdapter.DataViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.list_layout,parent,false
        )
        context = parent.context
        return DataViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.itemView.tvMAC.text = data[position].MAC
        holder.itemView.tvRssi.text = data[position].RSSI
        holder.itemView.tvDevice.text = "device " + data[position].Device.toString()

        holder.itemView.setOnClickListener {
            val context=holder.itemView.context
            Log.d(TAG,"Hello")
            val i = Intent(context,MainActivity2::class.java)
            val mac:String = data[position].MAC
            val rssi:String = data[position].RSSI
            val device: String = "device " + data[position].Device.toString()
            i.putExtra("MAC",mac)
            i.putExtra("RSSI",rssi)
            i.putExtra("Device",device)
            context.startActivity(i)


        }


    }

    override fun getItemCount(): Int = data.size
    class DataViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

}
