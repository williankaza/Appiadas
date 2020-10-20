package br.com.fiap.appiada

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btNewJoker.setOnClickListener { showJoker() }
        showJoker()
    }

    private fun showJoker() {
        val jokers = resources.getStringArray(R.array.jokers)
        val numberJoker = Random().nextInt(jokers.size)

        tvJoker.text = jokers[numberJoker]
        playSong()
    }

    private fun playSong(){
        val mediaPlayer = MediaPlayer.create(this, R.raw.badumtss)
        mediaPlayer.start()
    }
}