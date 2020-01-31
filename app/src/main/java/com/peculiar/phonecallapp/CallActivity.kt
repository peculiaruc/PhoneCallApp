package com.peculiar.phonecallapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peculiar.phonecallapp.MainActivity.Companion.Phone_number
import kotlinx.android.synthetic.main.activity_call.*
import kotlinx.android.synthetic.main.activity_main.*

class CallActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        val receivedString: String? = intent.getStringExtra(Phone_number)
        txt_number.text = receivedString
        val phoneno: String = txt_number.text.toString()

        button2.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $numberEt"))
            startActivity(intent)

        }
    }
}
