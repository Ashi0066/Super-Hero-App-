package com.example.superheroapp.model

import com.example.superheroapp.R

object HeroRespository {

    val Heroes = listOf(
        Hero(
             R.string.hero1,
             R.string.description1,
            R.drawable.android_superhero1
        ),
        Hero(
             R.string.hero2,
             R.string.description2,
             R.drawable.android_superhero2
        ),
        Hero(
            heroNameId = R.string.hero3,
            heroDesID   = R.string.description3,
            herImageId= R.drawable.android_superhero3
        ),
        Hero(
         R.string.hero4,
            R.string.description4,
            R.drawable.android_superhero4
        ),
        Hero(
            R.string.hero5,
          R.string.description5,
            R.drawable.android_superhero5
        ),
        Hero(
             R.string.hero6,
             R.string.description6,
           R.drawable.android_superhero6
        )
    )
}