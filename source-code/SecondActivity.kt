package com.example.appcent2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // get back from SecondActivity

        button7.setOnClickListener {

            onBackPressed()
        }

        navigate_registration.setOnClickListener {

            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
