package com.jetbrains.weatherapp.country

import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val capital: List<String> = emptyList(),
    val capitalInfo: CapitalInfo? = null,
    val flags: Flags,
    val name: Name,
)