package com.example.kotlinpractice

// 1. Lamda
/*
 * 람다식은 우리가 마치 value처럼 다룰 수 있는 익명함수이다.
 * 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a :Int)
 * 2) return 값으로 사용할 수 있다.
 *
 * 람다의 기본 정의
 * val lamdaName : Type = {argumentList -> codeBody}
 */

val square : (Int) -> (Int) = {number -> number*number} //lamda식
// val square = {number : Int -> number*number}

val nameAge = {name : String, age : Int -> "my name is ${name} I'm ${age}"}

fun main(){
    println("-------------Lamda-----------------")
    println(square(12))
    println(nameAge("Yurim", 23))

    println("-------------확장 함수-----------------")
    val a = "Yurim said"
    val b = "Android said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("yurryme", 23))

    println("--------Int를 받고 String으로 반환---------")
    println(calcuateGrade(97))
    println(calcuateGrade(971))

    println("-------람다를 표현하는 여러가지 방법--------")
    val lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda)) //값이 같지 않아서 false
    println(invokeLamda({it > 3.22})) //invokeLamda { it > 3.22 }

    println(invokeLamda { it > 3.22 }) //fun의 마지막 파라미터일때는 이렇게 생략해서 사용 가능, it은 lamda
}

// 확장 함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String{
    val introduceMyself : String.(Int) -> String = {
        "I'm ${this} and ${it} years old"
        //this -> 확장함수가 가리키는 오브젝트, it -> Int, it을 사용하는 이유는 Int 하나만 파라미터이기 때문에
    }
    return name.introduceMyself(age)
}

// 람다의 return

//Int를 받고 String으로 반환
val calcuateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

//pojo