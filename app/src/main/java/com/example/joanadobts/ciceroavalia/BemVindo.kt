package com.example.joanadobts.ciceroavalia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.logintest.DebugActivity
import kotlinx.android.synthetic.main.activity_main.*

class BemVindo : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bemvindo)

        var buttonProf = findViewById<Button>(R.id.button7)

        buttonProf.setOnClickListener {

            val nextIntent = Intent(this, Professores::class.java)
            startActivity(nextIntent)
        }

    }

    val args:Bundle? = intent?.extras
    val nome:String? = args?.getString("usuario")
}



