package com.example.basiccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Start of the Calculator Logic (Basic)

        //  Input
        val txtFirstNumber  = findViewById<EditText>(R.id.txtFirstNumber)
        val txtSecondNumber  = findViewById<EditText>(R.id.txtSecondNumber)

        //Buttons
        val btnAdd  = findViewById<Button>(R.id.btnAdd)
        val btnSubtract  = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply  = findViewById<Button>(R.id.btnMultiply)
        val btnDivide  = findViewById<Button>(R.id.btnDivide)

        //Output
        val lblOutput = findViewById<TextView>(R.id.lblOutput)

        //Adding Two Numbers
        btnAdd.setOnClickListener {
            val numOne : Int = txtFirstNumber.text.toString().toInt()
            val numTwo : Int = txtSecondNumber.text.toString().toInt()
            val NumberResult = numOne + numTwo
            lblOutput.text = NumberResult.toString()
        }
        //Subtracting Two Numbers
        btnSubtract.setOnClickListener {
            val numOne : Int = txtFirstNumber.text.toString().toInt()
            val numTwo : Int = txtSecondNumber.text.toString().toInt()
            val NumberResult = numOne - numTwo
            lblOutput.text = NumberResult.toString()
        }

        //Multiply Two Numbers
        btnMultiply.setOnClickListener {
            val numOne : Int = txtFirstNumber.text.toString().toInt()
            val numTwo : Int = txtSecondNumber.text.toString().toInt()
            val NumberResult = numOne * numTwo
            lblOutput.text = NumberResult.toString()
        }

        //Dividing Two Numbers
        btnDivide.setOnClickListener {
            val numOne : Float = txtFirstNumber.text.toString().toFloat()
            val numTwo : Float = txtSecondNumber.text.toString().toFloat()
            val NumberResult : Float = numOne / numTwo
            lblOutput.text = NumberResult.toString()
        }


    }
}