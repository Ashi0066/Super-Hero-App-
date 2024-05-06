package com.example.superheroapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
   @StringRes val heroNameId :Int,
   @StringRes val heroDesID :Int,
    @DrawableRes val herImageId  :Int

)
