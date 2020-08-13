package com.example.appcent2

class MainSource {

    companion object {

        fun createMainSource() : ArrayList<Workshops> {

            val workshop = ArrayList<Workshops> ()

            // start enlarging ArrayList

            workshop.add(

                Workshops(

                    "https://raw.githubusercontent.com/kaanguney/recyclerview_images/master/zpl8.png",

                    "Mustafa Dalcı ile UI/UX Hakkında"
                )
            )

            workshop.add(

                Workshops(

                    "https://raw.githubusercontent.com/kaanguney/recyclerview_images/master/zpl5.png",

                    "Verena Letzner : İçerik Yönetimi User Experience'ı nasıl etkiler?"
                )
            )

            workshop.add(

                Workshops(

                    "https://raw.githubusercontent.com/kaanguney/recyclerview_images/master/zpl2.png",

                    "Nesnelerin İnterneti Değil, Deneyimin Yeni Boyutu"
                )
            )

            return workshop
        }
    }
}