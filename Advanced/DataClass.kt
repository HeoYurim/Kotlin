package com.example.kotlinpractice

data class Ticket(val companyName : String, val name: String, var data :String, var seatNumber : Int)
//to String(), hashCode(), equals(), copy()

class TicketNormal(val companyName : String, val name: String, var data :String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreaAir", "Yurim Heo", "2021-12-24", 25)
    val ticketB = TicketNormal("koreaAir", "Yurim Heo", "2021-12-24", 25)

    println(ticketA)
    println(ticketB)
}

