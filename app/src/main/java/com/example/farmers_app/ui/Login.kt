package com.example.farmers_app.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.farmers_app.R
import org.w3c.dom.Text

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var Email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.passw)
        val Loginbtn = findViewById<Button>(R.id.loginBtn)
        val Signin = findViewById<TextView>(R.id.signin)

        Loginbtn.setOnClickListener{
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        Signin.setOnClickListener {
            intent = Intent(this,Signup::class.java)
            startActivity(intent)
        }

    }
}