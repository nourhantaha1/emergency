package com.example.emergency.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import com.example.emergency.R

class MainActivity2 : AppCompatActivity() ,View.OnClickListener {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val b_type = resources.getStringArray(R.array.bloodtype)

        button = findViewById(R.id.signup2)
        button.setOnClickListener(this)
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                R.layout.spinner, b_type
            )
            spinner.adapter = adapter

            spinner.setSelection(0)


            spinner.onItemSelectedListener = object :
                OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    Toast.makeText(
                        this@MainActivity2,
                        getString(R.string.selected_item) + " " +
                                "" + b_type[position], Toast.LENGTH_SHORT
                    ).show()
                    spinner.post (Runnable {
                        spinner.setSelection(position)
                    })
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }

            }

        }


    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.signup2 -> {
                Toast.makeText(this, " sign up button cliclked", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, com.example.emergency.ui.MainActivity3::class.java)
                startActivity(intent)

            }

        }

    }
}
