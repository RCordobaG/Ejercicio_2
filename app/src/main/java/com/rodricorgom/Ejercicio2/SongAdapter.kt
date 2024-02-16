package com.rodricorgom.Ejercicio2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class SongAdapter (private val list:ArrayList<Song>) : RecyclerView.Adapter<SongViewHolder>(){
    var onItemSelected : ((Song) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return SongViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.render(list[position], onItemSelected)
    }
}


class SongViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val songTitle = view.findViewById<TextView>(R.id.songTitle)
    val albumName = view.findViewById<TextView>(R.id.albumName)
    val songList = view.findViewById<ConstraintLayout>(R.id.root)

    fun render(song: Song, onItemSelected : ((Song) -> Unit)?){
        songTitle.text = song.title
        albumName.text = song.album
        songList.setOnClickListener {
            onItemSelected?.invoke(song)
        }
    }
}