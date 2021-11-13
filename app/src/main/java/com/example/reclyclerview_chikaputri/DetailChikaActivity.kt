package com.example.reclyclerview_chikaputri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailChikaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_chika)

        val chika = intent.getParcelableExtra<Chika>(MainActivity.INTENT_PARCELABLE)

        val imgChika = findViewById<ImageView>(R.id.img_item_photo)
        val nameChika = findViewById<TextView>(R.id.tv_item_name)
        val descChika = findViewById<TextView>(R.id.tv_item_description)

        imgChika.setImageResource(chika?.imgChika!!)
        nameChika.text = chika.nameChika
        descChika.text = chika.descChika
    }
}