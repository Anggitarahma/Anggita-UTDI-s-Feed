package com.example.anggitautdisfeed.data

import com.example.anggitautdisfeed.R
import com.example.anggitautdisfeed.model.Feed

class Datasource {

    fun loadFeed(): List<Feed> {
        //membuat function loadFeed yang berisi data pada file Feed.kt
        return listOf<Feed>(
            Feed(R.string.caption1, R.drawable.feed1),
            Feed(R.string.caption2, R.drawable.feed2),
            Feed(R.string.caption3, R.drawable.feed3),
            Feed(R.string.caption4, R.drawable.feed4),
            Feed(R.string.caption5, R.drawable.feed5),
            Feed(R.string.caption6, R.drawable.feed6),
            Feed(R.string.caption7, R.drawable.feed7),
            Feed(R.string.caption8, R.drawable.feed8),
            Feed(R.string.caption9, R.drawable.feed9),
            Feed(R.string.caption10, R.drawable.feed10)
        //menampilkan teks String dan file gambar yang telah di inisialisasi di file Feed.kt
        )
    }
}