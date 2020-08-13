package com.example.appcent2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val background = object : Thread() {

            override fun run() {
                try {
                    Thread.sleep(3000)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {

                    e.printStackTrace()
                }
            }
        }

        background.start()
    }
}
