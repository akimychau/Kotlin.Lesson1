package ru.akimychev.kotlinlesson1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<AppCompatButton>(R.id.btn).setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                sayHello()

            }
        })

        Log.d("@@@", "The random number is: ${randomWhen()}")
        loots()

    }

    //Кидает тост-приветсвие с использованием имени и места человека (person копирует объект me)
    fun sayHello() {

        val me = Person()

        val name = findViewById<EditText>(R.id.name).text
        val surname = findViewById<EditText>(R.id.surname).text

        val person = if (name.toString() == "" && surname.toString() == "") {
            me.copy()
        } else {
            me.copy(name = name.toString(), surname = surname.toString())
        }

        Toast.makeText(
            this@MainActivity,
            "Hello, ${person.name} ${person.surname}!",
            Toast.LENGTH_SHORT
        ).show()

        Toast.makeText(this@MainActivity, "My name is ${me.name} ${me.surname}", Toast.LENGTH_SHORT)
            .show()
    }

    private fun randomWhen(): String {

        val oneOfFive = when ((0..5).random()) {
            0 -> "Zero"
            1 -> "One"
            2 -> "Two"
            3 -> "Three"
            4 -> "Four"
            5 -> "Five"
            else -> {
                "Nothing"
            }
        }
        return oneOfFive
    }

    private fun loots() {
        val lootNames = listOf("Саша", "Маша", "Гоша", "Петя", "Варя", "Вика", "Леша", "Миша")

        Log.d("@@@", "---------------------------------------------")

        lootNames.forEach {
            Log.d("@@@", it)
        }

        Log.d("@@@", "---------------------------------------------")

        for (i in lootNames.indices step 2) {
            Log.d("@@@", lootNames[i])
        }

        Log.d("@@@", "---------------------------------------------")

        repeat(lootNames.size) {
            Log.d("@@@", "$it")
        }

    }
}


