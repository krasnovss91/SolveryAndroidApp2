package com.example.myapplication99

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Fragment1())
                    .commitAllowingStateLoss()
            }

        })

        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Fragment2())
                    .commitAllowingStateLoss()
            }
        })
    }
}