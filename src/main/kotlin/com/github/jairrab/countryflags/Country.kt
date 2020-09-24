package com.github.jairrab.countryflags

import com.github.jairrab.countryflags.CountryID
import java.io.Serializable

data class Country(
    val countryID: CountryID,
    val name: String,
    val flag: String
) : Serializable