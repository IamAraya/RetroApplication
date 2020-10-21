package com.example.retroapplication.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retroapplication.Data.ApiService
import com.example.retroapplication.Data.Cars
import com.example.retroapplication.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cars_item.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit private var apiService: ApiService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rcv = findViewById<RecyclerView>(R.id.recyclerView)
        rcv.layoutManager = LinearLayoutManager(this)
        val items = mutableListOf<Cars>()

        apiService = ApiService()
        val call = apiService.getCars()

        call.enqueue(object : Callback<List<Cars>> {
            override fun onResponse(call: Call<List<Cars>>, response: Response<List<Cars>>) {
                if (response.isSuccessful) {
                    recyclerView.apply {

                        /*
                        val list = response.body
                        for (i in 0 until list!!.size) {
                            val msg = "jobNo: ${list[i].jobNo}\n truckLicense: ${list[i].truckLicense}\n"
                            textView_item.append(msg)
                        }*/
                    }
                }
            }
            override fun onFailure(call: Call<List<Cars>>, t: Throwable) {
                Log.e("API" , t.message.toString())
            }
        })

    }
}

/*
val call = apiService.getCars()

        call.enqueue(object : Callback<List<Cars>> {
            override fun onResponse(call: Call<List<Cars>>, response: Response<List<Cars>>) {
               if (response.isSuccessful){
                   val list = response.body()
                   Log.i("API","${list!!.size}")
               }

            }

            override fun onFailure(call: Call<List<Cars>>, t: Throwable) {
                Log.e("API" , t.message.toString())
            }


        })

         /*val list = response.body()
                    for(i in 0 until list!!.size){
                        val msg = "jobNo: ${list[i].jobNo}\n truckLicense: ${list[i].truckLicense} \n"
                        textView.append(msg)
                    }*/
 */