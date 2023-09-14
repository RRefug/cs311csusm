package com.hdaf.assignmen1_rafaelrefugio_johnplummer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gradeButton = findViewById<Button>(R.id.grade_button)
        gradeButton.setOnClickListener{

            // if the button is clicked, we want to launch the new activity page!! Grading
            if(gradeButton.isActivated)
            {
                intent = Intent(applicationContext, GradeActivity::class.java)
                startActivity(intent)
            }

        }
    }
}