package com.fischer.msu.stoplight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.graphics.Color


class MainActivity : AppCompatActivity() {

    private lateinit var stopLightButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun button(view: View) {

    }


/*    stopLightButton.setOnClickListener{
        if (isStop) {
            background.Color = ""
                    }
                             }*/

}