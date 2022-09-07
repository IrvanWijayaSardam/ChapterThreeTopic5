package com.aminivan.chapterthreetopic5.latihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.chapterthreetopic5.ListStudent
import com.aminivan.chapterthreetopic5.R
import com.aminivan.chapterthreetopic5.StudentAdapter

class ProvinsiAdapter(val listProvinsi: ArrayList<ListProvinsi>) : RecyclerView.Adapter<ProvinsiAdapter.ViewHolder>() {
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        var namaProvinsi = view.findViewById<TextView>(R.id.txtProvinsi)
        var namaIbukota = view.findViewById<TextView>(R.id.txtIbuKota)
        var imgProvinsi = view.findViewById<ImageView>(R.id.imgProvinsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_provinsi,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProvinsi.text = listProvinsi[position].namaProvinsi
        holder.namaIbukota.text = listProvinsi[position].namaIbukota
        holder.imgProvinsi.setImageResource(listProvinsi[position].imgIbukota)
    }

    override fun getItemCount(): Int {
        return listProvinsi.size
    }
}