package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.util

//this arch will be use to filter and sort the Notes
sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
