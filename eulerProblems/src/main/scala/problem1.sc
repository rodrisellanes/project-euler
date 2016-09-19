// Multiples of 3 and 5

def magicSum(num: Int): Int = {
  def loop(n: Int, mult: Int, acc: Int): Int = {
    if((n * mult) < 1000) acc + loop(n, mult + 1, n * mult)
    else acc
  }
  loop(num, 1, 0)
}
val result = magicSum(3) + magicSum(5)

// Using map and filter and sum
def magicSum2(num: Int, threshold: Int): Int = {
  (1 to threshold).map(mult => mult * num).
    filter(sum => sum < threshold).sum
}
magicSum2(3, 1000) + magicSum2(5, 1000)

// Using map, withFilter, map and reduce
def magicSum3(num: Int, threshold: Int): Int = {
  (1 to threshold).map(mult => mult * num).
    withFilter(x => x < threshold) map(y => y) reduce(_ + _)
}
magicSum3(3, 1000) + magicSum3(5, 1000)

