package com.example.kotlinpractice

open class Human(val name:String = "Anonymous"){ // class Human constructor(name:String) , 주생성자

    constructor(name : String, age : Int):this(name) { // 부생성자
        println("my name is ${name}, ${age}years old")
    }

    init { //init 하고 constructor 함
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so yummy")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){ //java로 치면 오버라이딩
    override fun singASong(){
        super.singASong()
        println("라ㅏ라라")
        println("my name is : ${name}")
    }
}


fun main(){
    /*
    val human = Human("Yurim")
    val stranger = Human()

    human.eatingCake()

    println("This human's name is ${human.name}")
    println("This human's name is ${stranger.name}")

    val friend = Human("hyunsu" , 23)*/

    val korean = Korean()
    korean.singASong()

}