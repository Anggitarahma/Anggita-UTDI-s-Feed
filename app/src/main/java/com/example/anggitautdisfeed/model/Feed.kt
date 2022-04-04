package com.example.anggitautdisfeed.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Feed(
    //inisialisasi fungsi StringRes untuk menampilkan caption pada file strings.xml dan fungsi DrawableRes
    //untuk menampilkan file gambar yang telah disimpan di folder drawable
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)