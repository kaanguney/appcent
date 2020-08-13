package com.example.appcent2

data class Speaker(

    var image: String,

    var username: String // Author of blog post


) {

    override fun toString(): String {
        return "Speaker(image='$image', username='$username')"
    }

}
