package com.example.appcent2

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<Speaker>{
            val list = ArrayList<Speaker>()
            list.add(
                Speaker(
                    "https://raw.githubusercontent.com/kaanguney/recyclerview_images/master/zpl1.png",
                    "Erkut Baloğlu"
                )
            )
            list.add(
                Speaker(
                    "https://raw.githubusercontent.com/kaanguney/recyclerview_images/master/zpl2.png",
                    "Özgür Mutlu Öz"
                )
            )

            list.add(
                Speaker(
                    "https://raw.githubusercontent.com/kaanguney/recyclerview_images/master/zpl3.png",
                    "Aslan Doğan"
                )
            )

            return list
        }
    }
}