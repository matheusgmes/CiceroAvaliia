package com.example.joanadobts.ciceroavalia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.logintest.DebugActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonLogin = findViewById<Button>(R.id.button1)
        var tLogin = findViewById<EditText>(R.id.tLog)
        var tPassword = findViewById<EditText>(R.id.tPass)
        var buttonSign = findViewById<Button>(R.id.button5)
        var buttonProf = findViewById<Button>(R.id.button7)
        var buttonOberdan = findViewById<Button>(R.id.button27)
        var buttonVoltar = findViewById<Button>(R.id.button4)


        buttonLogin.setOnClickListener {

            var login = tLogin.text.toString()
            var senha = tPassword.text.toString()

            if (login.toLowerCase() == "denilson" && senha == "nave19") {

                val intent = Intent(this, BemVindo::class.java)
                val params = Bundle()
                params.putString("usuario", login)
                intent.putExtras(params)
                startActivity(intent)
            } else {

                Toast.makeText(this, "login e/ou senha incorretos", Toast.LENGTH_LONG).show()
            }

        }

        buttonSign.setOnClickListener {

            val nextIntent = Intent(this, Cadastro::class.java)
            startActivity(nextIntent)
        }
        buttonProf.setOnClickListener {

            val nextIntent = Intent(this, Professores::class.java)
            startActivity(nextIntent)
        }
        buttonOberdan.setOnClickListener {

            val nextIntent = Intent(this, Oberdan::class.java)
            startActivity(nextIntent)
        }
        buttonVoltar.setOnClickListener {

            val nextIntent = Intent(this, Professores::class.java)
            startActivity(nextIntent)
        }

    }
    }



