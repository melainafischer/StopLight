package com.fischer.msu.stoplight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.graphics.Color
import android.widget.ImageView
import com.fischer.msu.stoplight.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var color = 0
        val button: Button = findViewById(R.id.button)

        binding.button.setOnClickListener {
            if (color == 0) {
                button.setBackgroundColor(Color.GREEN)
                button.setText("Go")
                binding.greenLightImage.visibility = (View.VISIBLE)
                binding.redLightImage.visibility = (View.INVISIBLE)
                binding.yellowLightImage.visibility = (View.INVISIBLE)
                //greenLightImage.visibility = View.VISIBLE
                //greenLightImage.visibility = view.visible
                color = 1
            } else if (color == 1) {
                button.setBackgroundColor(Color.YELLOW)
                button.setText("Wait")
                binding.greenLightImage.visibility = (View.INVISIBLE)
                binding.redLightImage.visibility = (View.INVISIBLE)
                binding.yellowLightImage.visibility = (View.VISIBLE)
                color = 2
            } else if (color == 2) {
                button.setBackgroundColor(Color.RED)
                button.setText("Stop")
                binding.greenLightImage.visibility = (View.VISIBLE)
                binding.redLightImage.visibility = (View.VISIBLE)
                binding.yellowLightImage.visibility = (View.INVISIBLE)
                color = 0
            }
        }
    }




    fun button(view: View) {

    }

/*    button.setOnClickListener {
        if () {
            set background color
            set button text
            set visibility of red light
            set visibility of yellow light
            set visibility of green light
            reset Boolean vars (isStop, isGo, isWait)

        } else if (isGo) {

            similar to above

        } else {
            similiar to above
        }
    }*/

}