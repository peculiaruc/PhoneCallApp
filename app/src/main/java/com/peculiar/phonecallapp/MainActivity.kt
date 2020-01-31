package com.peculiar.phonecallapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next_btn.setOnClickListener(){
            val phoneNumber: String = numberEt.text.toString()
            Toast.makeText(this@MainActivity, " Hi! Welcome Please ring me.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CallActivity::class.java)
            intent.putExtra(Companion.Phone_number, phoneNumber)
            startActivity(intent)
        }


    }

    companion object {
        const val Phone_number: String = "number_extras"

    }
}
