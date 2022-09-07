package com.aminivan.chapterthreetopic5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudent = arrayListOf(
            ListStudent("Irvan Wijaya","20SA1106",R.drawable.ic_launcher_foreground),
            ListStudent("Wijaya Irvan","20SA1107",R.drawable.ic_launcher_foreground),
            ListStudent("Irvan Wijaya Kusuma","20SA1108",R.drawable.ic_launcher_foreground),
            ListStudent("Kusuma Wijaya Irvan","20SA1109",R.drawable.ic_launcher_foreground),
            ListStudent("Irvan Santai","20SA1110",R.drawable.ic_launcher_foreground),

        )

        val adapter = StudentAdapter(listStudent)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val recyclerView = findViewById<RecyclerView>(R.id.rvStudent)
        //val gv = GridLayoutManager(this,2)


        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter


    }
}