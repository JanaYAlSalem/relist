package com.example.relist.data
import com.example.relist.R
import com.example.relist.model.af

class Datasource {

    fun loadAffirmations(): List<af> {
        return listOf<af>(
            af(R.string.a,R.drawable.image1),
            af(R.string.b,R.drawable.image2),
            af(R.string.c,R.drawable.image3),
            af(R.string.d,R.drawable.image4),
            af(R.string.f,R.drawable.image5),
            af(R.string.g,R.drawable.image6)
        )
    } // end fun
}