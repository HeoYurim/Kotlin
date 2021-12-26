package com.example.kotlinpractice

/* 1. 함수
 * 2. val vs var
 * 3. String Template
 * 4. 조건식
 * 5. Array and List
 * 6. 반복문 For / While
 * 7. Nullable / NonNull
 */

fun main(){
    helloWorld()
    println("-----------------------------------------------")
    println(add (4, 5))
    println("-----------------------------------------------")

    //3. String Template
    val name = "Yurim"
    val Lastname = "Heo"
    println("my name is $name")
    println("my name is ${name}I'm 23") //띄어쓰기 안하고 싶으면 {} 사용
    println("my name is ${name + Lastname} I'm 23")

    println("this is 2\$a") // \사용하여 $가 문자인걸 알리기
    println("-----------------------------------------------")

    checkNum(1)
    println("-----------------------------------------------")

    forAndWhile()
    println("-----------------------------------------------")

    nullcheck()
    println("-----------------------------------------------")
}

//1. 함수

// return 값 없는 경우
fun helloWorld() : Unit{ //return형 없을 때 Unit 써주기 (약간 void느낌) , 생략 가능
    println("Hello World!")
}

// return 타입 있는 경우
fun add(a : Int, b : Int) : Int{
    return a + b
}

// 2. val vs var
fun hi() {
    val a: Int = 10 //변하지 않는 값
    var b: Int = 9 //변할 수 있는 값
    b = 100

    var e: String

    val c = 100 //Int는 안써도 됨
    var d = 100

    var name = "Yurim"
}

// 4. 조건식
fun maxBy(a: Int, b: Int) : Int {
    if(a > b){
        return a
    }
    else{
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if (a>b) a else b

fun checkNum(score : Int){
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }
    var b = when(score){ // when은 else 써줘야됨
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// 5. Array and List
/*
    List 1. List(수정 불가능) 2. MutableList(수정 가능)
 */
fun array(){
    val array = arrayOf(1,2,3) // 초기화
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",2.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    // list[0] = 2 변경 불가능
    var result = list.get(0)

    var arrayList = arrayListOf<Int>() //arrayList 참조값은 안바뀌어서 val로 써도 됨
    arrayList.add(10)
    arrayList.add(20)
}

// 6. 반복문 For / While
fun forAndWhile(){
    val students = arrayListOf("joy","james","jenny","jennifer")
    for (name in students){
        println("${name}")
    }

    for((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }
    println("-----------------------------------------------")

    var sum: Int = 0
    for(i in 1..10){
        sum += i
    }
    println(sum)

   /*
    for(i in 1..10 step 2){
        sum += i
    }
    println(sum)

    for(i in 10 downTo 2){
        sum += i
    }
    println(sum)

    for(i in 1 until 100){ // 1..100
        sum += i
    }
    println(sum)

    */

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++ //중요
    }
}

// 7. Nullable / NonNull

fun nullcheck(){
    //NPE : NULL pointer Exception

    var name : String = "Yurim" // String 생략 가능

    var nullName : String? = null //NonNull 타입에 null을 써서 오류였는데 ?를 쓰면서 오류 막음, 타입(String) 생략하면 안됨

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase() // ?를 안쓰면 오류인데 쓰면 nullName이 null이 아니면 touppercase를 하고 null이면 null 반환

    // ?:
    val laseName : String? = null

    val fullName = name + " " + (laseName?: "No lastName") //lastname이 null일 경우 no lastname 출력
    /*
      val laseName : String? = Heo

      val fullName = name + " " + (laseName?: "No lastName")
     */

    println(fullName)

    //!! -> null 아닌거 보증해줄게

}

fun ignoreNulls(str:String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase() // !!을 했기 때문에 ?안써도 됨

    val email : String? = "yurimXXX@nnav.vomm"
    email?.let{ // let을 쓰면 email을 lamda식 내부로 옮겨줌
        println("my email is ${email}")

    }
}

