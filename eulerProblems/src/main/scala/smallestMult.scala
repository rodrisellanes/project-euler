/**
  * Created by rdsel on 4/10/2016.
  *
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
  *
  */
object smallestMult extends App {

  def smallestMultip: List[Int] = {
    (1 to 500000000).toStream.filter(num =>
      (1 to 20).forall(num % _ == 0)).take(1).toList

//    Using List slow solution (first create all the list and then check the rule.
//    (1 to 500000000).filter(num =>
//      (1 to 20).forall(num % _ == 0)).toList
  }

  def checkRule(num: BigInt): Boolean = {
    (1 to 20).forall(num % _ == 0)
  }

  println(smallestMultip)

//  assert(smallestMultip.head == 2520)
//  assert(checkRule(2520))
//  assert(checkRule(232792560))

}
