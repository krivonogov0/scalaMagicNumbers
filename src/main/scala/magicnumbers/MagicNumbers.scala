package magicnumbers

object MagicNumbers {
  def isMagicNumber(num: BigInt): Boolean = {
    if (num == 0) return true
    
    val strNum = num.toString
    for (i <- 1 to strNum.length) {
      val part = strNum.substring(0, i).toLong
      if (part % i != 0) return false
    }
    true
  }

  def countDigits(num: BigInt): Int = num.toString.length

  def findMagicNumbers(limit: BigInt): Map[Int, List[BigInt]] = {
    Iterator.iterate(BigInt(1))(_ + 1)
      .takeWhile(_ <= limit)
      .filter(isMagicNumber)
      .toList
      .groupBy(countDigits)
  }

  def findPandigitalMagicNumbers(magicNumbers: List[BigInt]): (BigInt, BigInt) = {
    val pandigital1to9 = magicNumbers.find(num => "123456789".forall(num.toString.contains(_))).getOrElse(BigInt(0))
    val pandigital0to9 = magicNumbers.find(num => "0123456789".forall(num.toString.contains(_))).getOrElse(BigInt(0))
    (pandigital1to9, pandigital0to9)
  }
}