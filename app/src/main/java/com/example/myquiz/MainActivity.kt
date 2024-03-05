package com.example.myquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTrue : Button = findViewById(R.id.btn_true)
        val btnFalse : Button = findViewById(R.id.btn_false)

        btnTrue.setOnClickListener {
            Toast.makeText(
                this,
                R.string.toast_true,
                Toast.LENGTH_SHORT,
            ).show()
        }

        btnFalse.setOnClickListener {
           Toast.makeText(
               this,
               R.string.toast_false,
               Toast.LENGTH_SHORT
           ).show()

        }

    }
}