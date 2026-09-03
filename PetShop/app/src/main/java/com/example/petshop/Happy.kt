package com.example.petshop

class Happy(): Mood("Happy") {
    override fun currMood(): String {
        return "I am $mood"
    }
}