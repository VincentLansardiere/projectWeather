package com.example.vince.projectweather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var isFragmentOneLoaded = true
    var manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragone = findViewById<Button>(R.id.btn_fragTemp)
        val fragtwo =  findViewById<Button>(R.id.btn_fragHum)

        fragone.setOnClickListener{ShowTemperature()}
        fragtwo.setOnClickListener {ShowHumidite()}
    }

    fun ShowTemperature(){
        val transaction = manager.beginTransaction()
        val fragment = Temperature()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = true
    }

    fun ShowHumidite(){
        val transaction = manager.beginTransaction()
        val fragment = Humidite()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = false
    }

}
