package com.example.hw_04_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var resultView1: TextView
    lateinit var resultView2: TextView
    lateinit var resultView3: TextView
    lateinit var resultView4: TextView
    lateinit var resultView5: TextView
    lateinit var resultView6: TextView
    lateinit var resultView7: TextView
    lateinit var resultView8: TextView
    lateinit var button: Button
    var mutableList = mutableListOf<Int>()
    val TAG = "hw"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultView1 = findViewById(R.id.textView1)
        resultView2 = findViewById(R.id.textView2)
        resultView3 = findViewById(R.id.textView3)
        resultView4 = findViewById(R.id.textView4)
        resultView5 = findViewById(R.id.textView5)
        resultView6 = findViewById(R.id.textView6)
        resultView7 = findViewById(R.id.textView7)
        resultView8 = findViewById(R.id.textView8)
        button = findViewById(R.id.clickMeButton)

        setButtonClickListener()
        //createRandomArray()

    }

    private fun createRandomArray() {
        mutableList.clear()
        resultView7.isVisible = false
        resultView8.isVisible = false
        var diceNumber = (7 until 10).random()
        mutableList = List(diceNumber) { Random.nextInt(1, 7) } as MutableList<Int>

        for(dice in mutableList.indices){
            when(dice){
                1 -> resultView1.text = mutableList[dice].toString()
                2 -> resultView2.text = mutableList[dice].toString()
                3 -> resultView3.text = mutableList[dice].toString()
                4 -> resultView4.text = mutableList[dice].toString()
                5 -> resultView5.text = mutableList[dice].toString()
                6 -> resultView6.text = mutableList[dice].toString()
                7 -> view7(dice)
                8 -> view8(dice)

            }
        }
    }


    private fun setButtonClickListener() {

        button.setOnClickListener {
            createRandomArray()
        }
    }

    private fun view7(dice: Int){
        resultView7.text = mutableList[dice].toString()
        resultView7.isVisible = true
    }

    private fun view8(dice: Int){
        resultView8.text = mutableList[dice].toString()
        resultView8.isVisible = true
    }
}




