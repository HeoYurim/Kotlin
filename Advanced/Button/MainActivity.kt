package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
            }

        })

        //람다식으로 간단히 표현하는 방법법
       //1. Kotlin interface가 아닌 자바 인터페이스여야 한다.
        //2. 그 인터페이스는 딱 하나 메소드만 가져야한다.

        button.setOnClickListener{

        }
    }
}