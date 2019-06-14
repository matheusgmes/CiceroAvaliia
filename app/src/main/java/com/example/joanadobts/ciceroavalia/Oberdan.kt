package com.example.joanadobts.ciceroavalia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.logintest.DebugActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.oberdan.*

class Oberdan : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oberdan)

        val nomes = arrayOf("LP", "CJD", "PI1", "PAD1", "PAD2")


        val adapter = ArrayAdapter( this, android.R.layout.simple_spinner_dropdown_item,
            nomes)

        adapter.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item)
        spinnerOberdan.adapter = adapter

        var buttonVoltar = findViewById<Button>(R.id.button4)

        buttonVoltar.setOnClickListener {

            val nextIntent = Intent(this, Professores::class.java)
            startActivity(nextIntent)
        }

    }



}



