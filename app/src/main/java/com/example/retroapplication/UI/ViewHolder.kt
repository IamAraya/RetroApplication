package com.example.retroapplication.UI

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retroapplication.R
import kotlinx.android.synthetic.main.cars_item.view.*

class ViewHolder (v : View) : RecyclerView.ViewHolder(v) {
    var textitem = v.findViewById<TextView>(R.id.textView_item)
    var textjobNo = v.findViewById<TextView>(R.id.textView_jobNo)
    var texttrucklicense =  v.findViewById<TextView>(R.id.textView_truckLicense)
    var textprovince =  v.findViewById<TextView>(R.id.textView_province)
    var texttruckType =  v.findViewById<TextView>(R.id.textView_truckType)
    var textrouteDt =  v.findViewById<TextView>(R.id.textView_routeDt)
    var textrouteCd =  v.findViewById<TextView>(R.id.textView_routeCd)
    var textlogisticPointCd =  v.findViewById<TextView>(R.id.textView_logisticPointCd)
    var textarrivalDt=  v.findViewById<TextView>(R.id.textView_arrivalDt)
    var textdepartureDt =  v.findViewById<TextView>(R.id.textView_departureDt)
}

/*
var textjobNo = v.findViewById<TextView>(R.id.textView_jobNo)
    var texttrucklicense =  v.findViewById<TextView>(R.id.textView_truckLicense)
    var textprovince =  v.findViewById<TextView>(R.id.textView_province)
    var texttruckType =  v.findViewById<TextView>(R.id.textView_truckType)
    var textrouteDt =  v.findViewById<TextView>(R.id.textView_routeDt)
    var textrouteCd =  v.findViewById<TextView>(R.id.textView_routeCd)
    var textlogisticPointCd =  v.findViewById<TextView>(R.id.textView_logisticPointCd)
    var textarrivalDt=  v.findViewById<TextView>(R.id.textView_arrivalDt)
    var textdepartureDt =  v.findViewById<TextView>(R.id.textView_departureDt)
 */


