package com.cafecito.cortado.core

import com.cafecito.cortado.core.Cortado._
import org.scalatest.FlatSpec

class TestCortado extends FlatSpec {
  "String, numbers and lists" should "concatenate nicely" in {
    val domain = List("google", "yahoo")

    val wev: Seq[Int] = List(2,4,5)

    val ddd = "http://"+++(List(2,3)*** List(3,45,5))+++".com";
    var domains = List("google", "amazon")
    var spaces = List("com", "org")
    var schemes = List("http", "https")
    var identifiers = 100 ||| (List(1,33) +++ 3) *** List(3,5)



    val addresses = "["+++schemes +++ "://www."+++domains+++"."+++spaces+++"/id/"+++identifiers+++"]"

    assert(addresses == List(
      "[http://www.google.com/id/8]",
      "[https://www.google.com/id/8]",
      "[http://www.amazon.com/id/8]",
      "[https://www.amazon.com/id/8]",
      "[http://www.google.org/id/8]",
      "[https://www.google.org/id/8]",
      "[http://www.amazon.org/id/8]",
      "[https://www.amazon.org/id/8]",
      "[http://www.google.com/id/0]",
      "[https://www.google.com/id/0]",
      "[http://www.amazon.com/id/0]",
      "[https://www.amazon.com/id/0]",
      "[http://www.google.org/id/0]",
      "[https://www.google.org/id/0]",
      "[http://www.amazon.org/id/0]",
      "[https://www.amazon.org/id/0]",
      "[http://www.google.com/id/5]",
      "[https://www.google.com/id/5]",
      "[http://www.amazon.com/id/5]",
      "[https://www.amazon.com/id/5]",
      "[http://www.google.org/id/5]",
      "[https://www.google.org/id/5]",
      "[http://www.amazon.org/id/5]",
      "[https://www.amazon.org/id/5]",
      "[http://www.google.com/id/0]",
      "[https://www.google.com/id/0]",
      "[http://www.amazon.com/id/0]",
      "[https://www.amazon.com/id/0]",
      "[http://www.google.org/id/0]",
      "[https://www.google.org/id/0]",
      "[http://www.amazon.org/id/0]",
      "[https://www.amazon.org/id/0]"
    ))

  }
  "numeric operations" should "be cool" in {

    val operation = (100 ||| List(5.0,25.0,40.0))*** 2


    println("["###operation###"]")

    val operationTimes3 = operation *** 3
    println(operationTimes3)

    val bracketed = operationTimes3@@@"]"
    val numbers = List(1,40,6)
    1000|||(numbers+++2)

    1000|||(numbers+++2) *** List(1, 3, 5)




    println((List("http", "https") +++ "://" +++
      List("www","dev")+++ "." +++
      List("google", "fb") +++ "." +++
      List("com", "net") +++ "/id/"+++
      numbers) @@@ "\n")


    println( "["###  "{n:"+++(1000|||(numbers+++2)) *** List(1, 3, 5)+++ "}" @@@"," ###"]")

  }
}
