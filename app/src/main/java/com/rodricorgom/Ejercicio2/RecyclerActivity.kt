package com.rodricorgom.Ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val songList = findViewById<RecyclerView>(R.id.recyclerSongList)

        val songListData = arrayListOf(
            Song("A pile of roses","The woods are calling"),
            Song("A melancholic sea shanty","The deep beyond"),
            Song("A sky of headlights","My guitar knows my name"),
            Song("A walk to the abyss","Taking the dogs outs")
        )

        val adapter = SongAdapter(songListData)

        songList.adapter = adapter
        songList.layoutManager = LinearLayoutManager(this,GridLayoutManager.VERTICAL,false)

    }
}