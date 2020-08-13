package com.example.appcent2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_zeroth.*


class ZerothActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zeroth)

        button1.setOnClickListener() {

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener() {

            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {

            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {

            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {

            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {

            onBackPressed()
        }

        // button6 comes back to Main Activity
    }
}
