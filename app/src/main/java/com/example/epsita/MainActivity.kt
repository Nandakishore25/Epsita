package com.example.epsita

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var mp: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val textv1 = findViewById<TextView>(R.id.textv1)
        val textv2 = findViewById<TextView>(R.id.textv2)
        val button1 = findViewById<Button>(R.id.click1)
        val button2 = findViewById<Button>(R.id.click2)
        val button3 = findViewById<Button>(R.id.click3)
        val button4 = findViewById<Button>(R.id.click4)
        val button5 = findViewById<Button>(R.id.click5)
        val cl = findViewById<ConstraintLayout>(R.id.cl)



        button1.setOnClickListener {

            val intent = Intent(this, b1::class.java)
            intent.putExtra("pic",1)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, b1::class.java)
            intent.putExtra("pic",2)

            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, b1::class.java)
            intent.putExtra("pic",3)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, b1::class.java)
            intent.putExtra("pic",4)
            startActivity(intent)

        }
        button5.setOnClickListener {
            val intent = Intent(this, b1::class.java)
            intent.putExtra("pic",5)
            startActivity(intent)


        }
    }
}
