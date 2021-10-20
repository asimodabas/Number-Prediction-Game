package com.asimodabas.number_prediction_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_tahmin.*
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {

    private var rastgeleSayi = 0
    private var sayac =5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahmin)


        rastgeleSayi= Random.nextInt(101)//0 ile 100 arası sayı üretecek
        Log.e("Rastgele Sayı",rastgeleSayi.toString())


        buttonTahmin.setOnClickListener {

            sayac=sayac-1


            val tahmin = editTextTextGirdi.text.toString().toInt()

            if (tahmin==rastgeleSayi){

                val intent = Intent(this, SonucActivity::class.java)
                intent.putExtra("sonuc",true)
                finish()
                startActivity(intent)

                return@setOnClickListener//Son tahmin hakkı ile tahmin edilirse buton çalışmasını durdurur
            }
            if (tahmin>rastgeleSayi){
                textViewYardım.text = "Azalt"
                textViewKalanHak.text = "Kalan Hak : $sayac"
            }
            if (tahmin<rastgeleSayi){
                textViewYardım.text = "Arttır"
                textViewKalanHak.text = "Kalan Hak : $sayac"

            }
            if (sayac==0){
                val intent = Intent(this, SonucActivity::class.java)
                intent.putExtra("sonuc",false)
                finish()
                startActivity(intent)

            }

            editTextTextGirdi.setText("")

        }
    }




}
