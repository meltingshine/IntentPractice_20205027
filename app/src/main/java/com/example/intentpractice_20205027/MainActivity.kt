package com.example.intentpractice_20205027

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      goToFirstBtn.setOnClickListener {
          val myIntent = Intent(this,FirstActivity::class.java)
          startActivity(myIntent)

      }
        goToSecondBtn.setOnClickListener {
            val myIntent = Intent(this,SecondActivity::class.java)
            startActivity(myIntent)

        }

        goToThirdBtn.setOnClickListener {
            val content = contentEdt.text.toString()
            val myIntent = Intent(this,ThirdActivity::class.java)
            myIntent.putExtra("input",content)
            startActivity(myIntent)


        }

        goToFourthBtn.setOnClickListener {
            val myIntent = Intent(this, FourthActivity::class.java)
            startActivityForResult(myIntent, 1000)


        }
    }

}
