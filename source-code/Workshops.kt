package com.example.appcent2

data class Workshops (

    var person_image : String,

    var workshop_name : String

) {

    override fun toString(): String {
        return "Workshops(person_image='$person_image', workshop_name='$workshop_name')"
    }
}