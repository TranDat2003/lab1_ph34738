package com.example.lab1_ph34738.bai4

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2
}