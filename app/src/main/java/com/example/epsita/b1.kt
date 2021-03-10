package com.example.epsita

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class b1 : AppCompatActivity() {
    lateinit var mp:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b1)

        val cl1=findViewById<ConstraintLayout>(R.id.cl1)
//        mp= MediaPlayer.create(this,R.raw.songsitsyou)
//        mp.isLooping=true
//        mp.setVolume(0.5f, 0.5f)
//        mp.start()
//        cl1.setBackgroundResource(R.drawable.epsita2)

        val n=intent.getIntExtra("pic",0)
        when(n){
            0->{
                mp= MediaPlayer.create(this,R.raw.songsitsyou)
                mp.isLooping=true
                mp.setVolume(0.5f, 0.5f)
                mp.start()
                cl1.setBackgroundResource(R.drawable.epsita2)
            }
            1->{
                mp= MediaPlayer.create(this,R.raw.deathbed)
                mp.isLooping=true
                mp.setVolume(0.5f, 0.5f)
                mp.start()
                cl1.setBackgroundResource(R.drawable.epsita1)
            }
            2->{
                mp= MediaPlayer.create(this,R.raw.lovemelikeyoudo)
                mp.isLooping=true
                mp.setVolume(0.5f, 0.5f)
                mp.start()
                cl1.setBackgroundResource(R.drawable.epsita3)
            }
            3->{
                mp= MediaPlayer.create(this,R.raw.songsitsyou)
                mp.isLooping=true
                mp.setVolume(0.5f, 0.5f)
                mp.start()
                cl1.setBackgroundResource(R.drawable.epsita4)
            }
            4->{
                mp= MediaPlayer.create(this,R.raw.athousandyearsringtone)
                mp.isLooping=true
                mp.setVolume(0.5f, 0.5f)
                mp.start()
                cl1.setBackgroundResource(R.drawable.epsita5)

            }
            5->{
                mp= MediaPlayer.create(this,R.raw.ursocute)
                mp.isLooping=true
                mp.setVolume(0.5f, 0.5f)
                mp.start()
                cl1.setBackgroundResource(R.drawable.epsita2)
            }
        }
    }

    override fun onPause() {
        super.onPause()
        mp.stop()
    }
}