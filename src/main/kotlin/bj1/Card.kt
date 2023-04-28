package bj1

import java.lang.IllegalArgumentException

class Card(val value:Int , val suit:Int){

    val msg = fun():String{   //anonymous fun
        return "Bad Suit"
    }

    val msg1 = { "Bad Suit"}   //lambda function

    init{          //kind of like constructor
        require(value in 1..13)  //Used to check illegal argument exception,this returns true or false , If this return false then it throws illegalArgumentException
        require(suit in 1..4,msg1)  // we can pass fun i.e msg1 to specify error msg for IllegalArgumentException
    }

//    val suitName:String get() {
//        return "Spades"
//    }
   // val suitName:String get() ="Spades"  //Another way of writing get method

    val valueName :String get() = when(value){
        1 -> "ace"
        in 2..10 -> value.toString()
        11 -> "Jack"
        12 -> "Queen"
        13 -> "King"
        else -> throw IllegalArgumentException()
    }

    val suitName:String get() = when(suit) {
        1 -> "Spades"
        2 -> "Hearts"
        3 -> "Diamonds"
        4 -> "Clubs"
        else -> throw IllegalArgumentException()
    }
//    val suitName:String get() {   // can also be written like this
//        when(suit) {
//            1 ->return "Spades"
//            2 ->return "Hearts"
//            3 ->return "Diamonds"
//            4 -> return "Clubs"
//            else -> throw IllegalArgumentException()
//        }
//    }




}