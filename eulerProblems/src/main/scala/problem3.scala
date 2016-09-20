/**
  * Created by rdsel on 19/9/2016.
  *
  * What is the largest prime factor of the number 13195 and 600851475
  */

object problem3 extends App {

  //  (1 until 13195).map(n => if(13195 % n == 0) println(List(n)) else Nil)

  def primeFactor(threshold: Int): AnyVal = {
    (1 until threshold).map(n =>
      if (threshold % n == 0) n).distinct.last
  }

  println(primeFactor(13195))
  // OutOfMemoryError
//  println(primeFactor(600851475))

}
