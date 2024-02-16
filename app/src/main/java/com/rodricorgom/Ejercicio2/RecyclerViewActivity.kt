package com.rodricorgom.Ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val songList = findViewById<RecyclerView>(R.id.recyclerSongList)

        val songListData = arrayListOf(
            Song("A pile of roses","The woods are calling"),
            Song("A melancholic sea shanty","The deep beyond"),
            Song("A sky of flashing headlights","My guitar knows my name"),
            Song("A walk to the abyss","Taking the dogs outs")
        )

        val adapter = SongAdapter(songListData)

        songList.adapter = adapter
        songList.layoutManager = LinearLayoutManager(this,GridLayoutManager.VERTICAL,false)

    }
}