package com.example.reclyclerview_chikaputri

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChikaAdapter (private val context: Context, private val chika: List<Chika>, val listener: (Chika) ->Unit)
    : RecyclerView.Adapter<ChikaAdapter.ChikaViewHolder>(){
    class ChikaViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgChika = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameChika = view.findViewById<TextView>(R.id.tv_item_name)
        val descChika = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(chika: Chika, listener: (Chika) -> Unit){
            imgChika.setImageResource(chika.imgChika)
            nameChika.text = chika.nameChika
            descChika.text = chika.descChika
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChikaViewHolder {
        return ChikaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_chika, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ChikaViewHolder, position: Int) {
        holder.bindView(chika[position], listener)
    }

    override fun getItemCount(): Int = chika.size
    }

