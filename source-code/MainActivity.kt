package com.example.appcent2

import android.app.PendingIntent.getActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Toast
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T


class MainActivity : AppCompatActivity() {

    private lateinit var speakerAdapter: SpeakerRecyclerAdapter

    private lateinit var workshopsAdapter: WorkshopsAdapter

    fun toastMsg(msg: String) {

        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initMainSource()
        mainDataSet()

        initRecyclerView()
        addDataSet()

        // navigate to the speaker page
        navigate_speakers.setOnClickListener {

            val intent = Intent(this, ZerothActivity::class.java)
            startActivity(intent)
        }

        AboutPage.setOnClickListener {

            val intent = Intent(this,AboutPageActivity::class.java)
            startActivity(intent)
        }

        sponsor_page.setOnClickListener {

            val intent = Intent(this, SponsorPageActivity::class.java)
            startActivity(intent)
        }

        xco.setOnClickListener {

            val intent = Intent(this, PreviouslyXCOActivity::class.java)
            startActivity(intent)
        }

        location.setOnClickListener {

            val intent = Intent(this,LocationActivity::class.java)
            startActivity(intent)
        }

        communication.setOnClickListener {

            val intent = Intent(this,CommunicationActivity::class.java)
            startActivity(intent)
        }

        home_button.setOnClickListener {

            toastMsg("Home Page")
        }

        navigate_awards.setOnClickListener {

            val intent = Intent(this,AwardsPageActivity::class.java)
            startActivity(intent)
        }
    }

    private fun mainDataSet(){

        val data = MainSource.createMainSource()
        workshopsAdapter.submitWorkshop(data)
    }


    private fun initMainSource() {

        recycler_view_main.apply {

            workshopsAdapter = WorkshopsAdapter()
            adapter = workshopsAdapter
        }

        recycler_view_main.setLayoutManager(
            LinearLayoutManager(
                recycler_view_main.getContext(),
                LinearLayoutManager.HORIZONTAL,
                false
            )
        )
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        speakerAdapter.submitList(data)
    }

    private fun initRecyclerView(){

        recycler_view.apply {
            speakerAdapter = SpeakerRecyclerAdapter()
            adapter = speakerAdapter
        }

        recycler_view.setLayoutManager(
            LinearLayoutManager(
                recycler_view.getContext(),
                LinearLayoutManager.HORIZONTAL,
                false
            )
        )
    }
}
