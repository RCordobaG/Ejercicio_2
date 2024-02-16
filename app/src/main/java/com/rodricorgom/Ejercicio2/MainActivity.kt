package com.rodricorgom.Ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        val toFrameBtn = findViewById<Button>(R.id.buttonFrame)
        val toLinearBtn = findViewById<Button>(R.id.buttonLinear)
        val toRecyclerBtn = findViewById<Button>(R.id.buttonRecycler)
        val toConstraintBtn = findViewById<Button>(R.id.buttonComponents)

        toFrameBtn.setOnClickListener{
            val frameIntent = Intent(this,FrameActivity::class.java)
            startActivity(frameIntent)
        }

        toLinearBtn.setOnClickListener{
            val linearIntent = Intent(this,LinearActivity::class.java)
            startActivity(linearIntent)
        }

        toRecyclerBtn.setOnClickListener{
            val recyclerIntent = Intent(this,RecyclerActivity::class.java)
            startActivity(recyclerIntent)
        }

        toConstraintBtn.setOnClickListener{
            val constraintIntent = Intent(this,ComponentesGraficos::class.java)
            startActivity(constraintIntent)
        }

    }
}