package com.asimodabas.number_prediction_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tahmin.*

class TahminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahmin)

        buttonTahmin.setOnClickListener {

            val intent = Intent(this, SonucActivity::class.java)
            finish()
            startActivity(intent)


        }
    }
}