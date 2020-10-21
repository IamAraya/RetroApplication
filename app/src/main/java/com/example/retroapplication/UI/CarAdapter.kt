package com.example.retroapplication.UI

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retroapplication.Data.Cars
import com.example.retroapplication.R

class CarAdapter(val data : List<Cars>,val context: Context?) :
    RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cars_item,parent,false)
        val holder = ViewHolder(v)
        return  holder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textjobNo.text = data[position].jobNo.toString()
        holder.texttrucklicense.text = data[position].truckLicense

    }

    override fun getItemCount(): Int {
        return  data.size
    }

}

/*
holder.textjobNo.text = data[position].jobNo
holder.texttrucklicense.text = data[position].truckLicense
 holder.apply {
            holder.textjobNo.text = data[position].jobNo.toString()
            holder.texttrucklicense.text = data[position].truckLicense
        }
 */


