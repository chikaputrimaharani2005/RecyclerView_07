package com.example.reclyclerview_chikaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chikaList = listOf<Chika>(
            Chika(
                R.drawable.chika,
            "Chika Putri Maharani",
            "Eyow Guys, Nama Saya Chika Putri Maharani, biasa dipanggil Cia. Saya tinggal di Sumpiuh. Mood saya sangat random guys, terkadang saya ceria, terkadang saya inging memukul Rapi."
            ),
            Chika(
                R.drawable.arya,
                "Arya Jupri",
                "Anak baik"
            ),
            Chika(
                R.drawable.arya,
                "Arya Jupri",
                "Anak baik"
            ),Chika(
                R.drawable.arya,
                "Arya Jupri",
                "Anak baik"
            ),Chika(
                R.drawable.arya,
                "Arya Jupri",
                "Anak baik"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_char)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ChikaAdapter(this, chikaList){
            val intent = Intent(this, DetailChikaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}