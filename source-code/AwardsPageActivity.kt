package com.example.appcent2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import kotlinx.android.synthetic.main.activity_awards_page.*

class AwardsPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awards_page)

        // return to the previous page

        return_from_awards.setOnClickListener {

            onBackPressed()
        }

        return_home_from_awards.setOnClickListener {  // go to main activity

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        usersports_site_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://beta.userspots.com/"))
            startActivity(intent)
        }

        usersports2_site_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://beta.userspots.com/"))
            startActivity(intent)
        }

        etiya_site_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://etiya.com/"))
            startActivity(intent)
        }

        etiya2_site_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://etiya.com/"))
            startActivity(intent)
        }

        fjord_site_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fjordnet.com/istanbul/"))
            startActivity(intent)
        }


        fjord2_site_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fjordnet.com/istanbul/"))
            startActivity(intent)
        }
    }
}
