package com.example.petshop

class Sad(): Mood("Sad") {
    override fun currMood(): String {
        return "I am $mood"
    }
}