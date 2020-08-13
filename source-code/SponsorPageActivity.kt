package com.example.appcent2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sponsor_page.*

class SponsorPageActivity : AppCompatActivity() {

    fun toastMsg(msg: String) { // display expired domain name error for Marketing & Management Institute

        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sponsor_page)

        sponsor_return_main.setOnClickListener {

            onBackPressed()
        }

        return_homepage_button.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }

        colins_website.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.colins.com.tr/"))
            startActivity(intent)
        }

        etiya_site_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.etiya.com/"))
            startActivity(intent)
        }

        fjord_site_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fjordnet.com/istanbul/"))
            startActivity(intent)
        }

        usersports_site_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://beta.userspots.com/"))
            startActivity(intent)
        }

        i_am_website_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://i-amonline.com.tr/"))
            startActivity(intent)
        }

        yatsan_website_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://yatsan.com/"))
            startActivity(intent)
        }

        one_car_website_link.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://onecar.com.tr"))
            startActivity(intent)
        }

        mgmt_website.setOnClickListener {

            toastMsg("Domain Name Expired !")
        }
    }
}
