package com.example.emergency.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.emergency.R

class MainActivity3 : AppCompatActivity(), View.OnClickListener {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button = findViewById(R.id.Button3)
        button.setOnClickListener(this)







    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.Button3->{
                Toast.makeText(this, " GPS", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,MainActivity4::class.java)
                startActivity(intent)
            }

        }

    }



    /*fun onclickSignup(view: android.view.View) {
        Toast.makeText(this, " sign up button clilked", Toast.LENGTH_SHORT).show()}*/

}