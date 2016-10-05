/**
  * Created by rdsel on 4/10/2016.
  */
object palindrom extends App {

  def palindromProduct: Int = {
    (1 until 1000).flatMap(a => (1 until 1000).map(b => a *  b)).
      filter(num => num.toString == num.toString.reverse).last
  }

  def isPalindrom(num: Int): Boolean = {
    val numStr = num.toString
    if(numStr == numStr.reverse) true
    else false
  }
  assert(isPalindrom(101), "Is not palindrome")
//  assert(palindromProduct == 9009) // With two digits

  println(palindromProduct) // With three digits
}
