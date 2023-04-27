package bj1

import org.junit.jupiter.api.Test

class LamdaTest {

  @Test
  public fun testAnonymousFunction() { //This anonymous fun wont be use that much
      val f1 = fun() {   //anonymous functions , calling a fun using variable
          println("ABC")
      }

      val f2 = fun(p: Int): Int {   //do ctrl+shift+p
          return p * p
      }

      f1()
      println("value of fun f2 ${f2(12)}")

      useFunction(f1,f2)  //passing a fun arg in other fun
  }
    fun useFunction(a:()->Unit, b: (Int)-> Int)
    {
        a()
        println( b(12))
    }


    @Test
    fun testLambdaFunctions(){

        val f1 = { println(111) } //do ctrl+shift+p , this is lambda expression
        val f2 = { p:Int -> p*p  } //f1 and f2 are the functions

        useFunction(f1 , f2)   //passing functions argument to a function

        //useFunction({ println(111) },{ p:Int -> p*p  })
        //      OR
        useFunction({ println(111) },{it -> it*it })  // used it

        val f3 = { p1:Float, p2:Int -> p1*p2 }    //using Lambda
          //OR
        var f4 = fun(p1:Float , p2:Int):Float{        // using anonymous fun
            return p1*p2
        }
        println(f3(12f,3))

    }


}