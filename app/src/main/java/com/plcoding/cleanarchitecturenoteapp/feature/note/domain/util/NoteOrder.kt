package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.util

//this is used to order in relation a note's parameters
sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)
}
