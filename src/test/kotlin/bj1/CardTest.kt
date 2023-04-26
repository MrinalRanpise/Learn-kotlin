package bj1

import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertEquals
import kotlin.test.fail

class CardTest {

    @Test
    fun t1() {

        val c1 = Card(1, 1)
        val c2 = Card(value = 13, suit = 4)

        assertEquals(1, c1.value)
        assertEquals(1, c1.suit)
        assertEquals("Spades", c1.suitName)
        assertEquals("ace", c1.valueName)
        assertEquals(13, c2.value)
        assertEquals(4, c2.suit)
        assertEquals("Clubs", c2.suitName)
        assertEquals("King", c2.valueName)

            //testcase for manual throwing IllegalArgumentException
        try {
             Card(1,5)
            fail("Code not reachable") //This code is unreachable , so we use fail to check
        } catch (e: IllegalArgumentException) {

        }
        try {
             Card(14,1)
            fail("Code not reachable") //This code is unreachable , so we use fail
        } catch (e: IllegalArgumentException) {

        }
    }

    @Test
    fun t2() {
        val x = if (4 > 3) "afd" else "ersa"   // if statement is expression
        println(x)
        val suit = 2
        val y = when (suit) {  //act as a switch
            1 -> "Spades"
            2 -> "Hearts"
            3 -> "Diamond"
            else -> "Clubs"
        }
        println("y= $y")
    }

    @Test
    fun t3(){
        val x =2..6  // here x is of type IntRange
        println(x.contains(7))
         // OR
        println(6 in x)  //we can use in operator instead of contains

    }

}