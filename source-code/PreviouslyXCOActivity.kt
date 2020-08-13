package com.example.appcent2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import kotlinx.android.synthetic.main.activity_previously_xco.*

class PreviouslyXCOActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previously_xco)

        return_home_from_end.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        return_from_previously_xco.setOnClickListener {

            onBackPressed() // go back
        }

        thumbnail_top.setOnClickListener {

            // youtube link -> XCO 18'

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLVv9INlYFxZgs7Tx4H5cI8ooglE-0YPIs"))
            startActivity(intent)
        }

        thumbnail_bottom.setOnClickListener {

            // link XCO 17'

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=f6-F6Wg7VII&feature=emb_title"))
            startActivity(intent)
        }


    }
}
