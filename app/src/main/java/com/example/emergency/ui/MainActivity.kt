package com.example.emergency.ui

import android.content.Intent
import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.emergency.R
import com.example.emergency.R.anim
import com.example.emergency.R.anim.animation

class MainActivity : AppCompatActivity(),View.OnClickListener {
        lateinit var button: Button
        lateinit var img:ImageView
        lateinit var animation: Animation
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            button = findViewById(R.id.btn_signup)
            button.setOnClickListener(this)
            img = findViewById(R.id.firstimg)
            animation=AnimationUtils.loadAnimation(this,R.anim.animation)
            img.startAnimation(animation)







        }


        override fun onClick(v: View?) {
            when(v?.id){
                R.id.btn_signup->{
                   Toast.makeText(this, " sign up button cliclked", Toast.LENGTH_SHORT).show()
                  val intent = Intent(this,MainActivity2::class.java)
                    startActivity(intent)
              }

          }

        }



        /*fun onclickSignup(view: android.view.View) {
            Toast.makeText(this, " sign up button clilked", Toast.LENGTH_SHORT).show()}*/

    }