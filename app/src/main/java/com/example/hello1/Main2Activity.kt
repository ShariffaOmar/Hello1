package com.example.hello1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvRegister.setOnClickListener {
            val intent= Intent(baseContext,RegistrationActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener{
            var userName=etUsername.text.toString()
            var password=etPassword.text.toString()
            Toast.makeText(baseContext,password,LENGTH_SHORT).show()

        }

    }
}
