package com.example.marriagesug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btOk = findViewById<Button>(R.id.btOk)
        val tvR = findViewById<TextView>(R.id.tvR)
        val rgGender = findViewById<RadioGroup>(R.id.rgGender)
        val rgAge = findViewById<RadioGroup>(R.id.rgAge)
        val rbAge1 = findViewById<RadioButton>(R.id.rbAge1)
        val rbAge2 = findViewById<RadioButton>(R.id.rbAge2)
        val rbAge3 = findViewById<RadioButton>(R.id.rbAge3)

        rgGender.setOnCheckedChangeListener { radioGroup, i ->
         when(i) {
             R.id.rbMale -> {
                 rbAge1.text = getString(R.string.male_age1)
                 rbAge2.text = getString(R.string.male_age2)
                 rbAge3.text = getString(R.string.male_age3)
             }

             R.id.rbFemale -> {
                 rbAge1.text = getString(R.string.female_age1)
                 rbAge2.text = getString(R.string.female_age2)
                 rbAge3.text = getString(R.string.female_age3)
             }
         }
        }
        btOk.setOnClickListener {
           when(rgAge.checkedRadioButtonId){
               R.id.rbAge1 -> tvR.text = getString(R.string.no_hurry)
               R.id.rbAge2 -> tvR.text = getString(R.string.find_couple)
               R.id.rbAge3 -> tvR.text = getString(R.string.get_marry)
           }
        }

    }
}






