package bj1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CardTest {

    @Test
    fun t1() {

        val c1 = Card(1, 1)
        val c2 = Card(value = 13, suit = 4)

        assertEquals(1, c1.value)
        assertEquals(1, c1.suit)
        assertEquals("Spades", c1.suitName)
        assertEquals(13, c2.value)
        assertEquals(4, c2.suit)
        assertEquals("Clubs", c2.suitName)
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

}