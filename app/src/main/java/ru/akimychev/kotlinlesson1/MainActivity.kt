package ru.akimychev.kotlinlesson1

import android.os.Bundle
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


    }

    //Кидает тост-приветсвие с использованием имени и места человека
    fun sayHello (){
        val name = findViewById<EditText>(R.id.name).text
        val place = findViewById<EditText>(R.id.place).text

        val person = Person(name.toString(), place.toString())

        Toast.makeText(this@MainActivity, "Hello, ${person.name} from ${person.place}!", Toast.LENGTH_SHORT).show()
    }
}