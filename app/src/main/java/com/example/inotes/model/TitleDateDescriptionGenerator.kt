package com.example.inotes.model

import kotlin.random.Random
import kotlin.random.nextInt


const val alphabets = "abcdefghijklmnopqrstuvwxyz"
fun generateFakeData(): ArrayList<String> {

    val title = shuffle()
    val desc = shuffle()

    return arrayListOf(title, desc)
}


fun shuffle(): String {
    var str = ""

    val range = Random.nextInt(20..100)
    for (i in 0..range) {
        str += alphabets[Random.nextInt(alphabets.length)]
    }
    return str
}























