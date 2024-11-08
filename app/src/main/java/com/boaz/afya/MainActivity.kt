package com.boaz.afya

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        Fetch the 6 cardviews
        val aboutcard = findViewById<CardView>(R.id.about)
        val causescard = findViewById<CardView>(R.id.causes)
        val symptomscard = findViewById<CardView>(R.id.symptoms)
        val preventioncard = findViewById<CardView>(R.id.prevention)
        val tollfreecard = findViewById<CardView>(R.id.tollfree)
        val locatecard = findViewById<CardView>(R.id.locate)

//        set on click listener to the cards
        aboutcard.setOnClickListener {
            startActivity(Intent(applicationContext,AboutActivity::class.java))

        }
//        end of about
        causescard.setOnClickListener {
            startActivity(Intent(applicationContext,CausesActivity::class.java))

        }
//        end of causes
        symptomscard.setOnClickListener {
            startActivity(Intent(applicationContext,SymptomsActivity::class.java))

        }
//        end of symptoms
        preventioncard.setOnClickListener {
            startActivity(Intent(applicationContext,PreventionActivity::class.java))

        }
//        end of prevention
        tollfreecard.setOnClickListener {
            startActivity(Intent(applicationContext,TollFreeActivity::class.java))

        }
//        end of toll free
        locatecard.setOnClickListener {
            startActivity(Intent(applicationContext,LocateActivity::class.java))

        }
//        end of locate
    }
}