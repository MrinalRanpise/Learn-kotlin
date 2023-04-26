package bj1

import java.lang.IllegalArgumentException

class Card(val value:Int , val suit:Int){

//    val suitName:String get() {
//        return "Spades"
//    }
    val valueName:String get() ="ABC"  //Another way of writing get method


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