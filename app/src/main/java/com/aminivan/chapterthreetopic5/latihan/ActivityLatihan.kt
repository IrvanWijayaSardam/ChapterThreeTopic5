package com.aminivan.chapterthreetopic5.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.chapterthreetopic5.ListStudent
import com.aminivan.chapterthreetopic5.R
import com.aminivan.chapterthreetopic5.StudentAdapter

class ActivityLatihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan)

        val listProvinsi = arrayListOf(
            ListProvinsi("DI Yogyakarta","Yogyakarta",R.drawable.yogyakarta),
            ListProvinsi("Bali","Denpasar",R.drawable.bali),
            ListProvinsi("Papua Barat","Manokwari",R.drawable.papua_barat_rumah_mod_aki_aksa),
            ListProvinsi("Sulawesi Tengah","Palu",R.drawable.sulawesi_tengah),
            ListProvinsi("Sulawesi Barat","Mamuji",R.drawable.sulawesi_barat),
            ListProvinsi("Sulawesi Tenggara","Kendari",R.drawable.sulawesi_tenggara),
            ListProvinsi("Sulawesi Utara","Manado",R.drawable.sulawesi_utara),
            ListProvinsi("Sumatra Barat","Padang",R.drawable.sumatra_barat),
            ListProvinsi("Sumatra Selatan","Padang",R.drawable.sumatera_selatan),
            ListProvinsi("Sumatra Utara","Medan",R.drawable.sumatera_utara),
            ListProvinsi("Sumatra Selatan","Palembang",R.drawable.sumatera_selatan),

            )

        val adapter = ProvinsiAdapter(listProvinsi)
        //val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val recyclerView = findViewById<RecyclerView>(R.id.rvLatihanMain)
        val gv = GridLayoutManager(this,2)


        recyclerView.layoutManager = gv
        recyclerView.adapter = adapter

    }
}