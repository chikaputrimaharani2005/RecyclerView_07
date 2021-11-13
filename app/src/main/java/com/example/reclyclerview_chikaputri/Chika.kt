package com.example.reclyclerview_chikaputri

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

class Chika(
    val imgChika: Int,
    val nameChika: String,
    val descChika: String,
) : Parcelable