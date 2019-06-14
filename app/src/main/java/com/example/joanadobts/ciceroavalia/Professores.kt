package com.example.joanadobts.ciceroavalia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.logintest.DebugActivity
import kotlinx.android.synthetic.main.activity_main.*

class Professores : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.professores)

        var buttonOberdan = findViewById<Button>(R.id.button27)

        buttonOberdan.setOnClickListener {

            val nextIntent = Intent(this, Oberdan::class.java)
            startActivity(nextIntent)
        }

    }
}



