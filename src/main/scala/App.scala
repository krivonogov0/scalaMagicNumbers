package magicnumbers

object App {
  def main(args: Array[String]): Unit = {
    val limit = BigInt("1000000") // Ограничение для поиска магических чисел
    val magicNumbers = MagicNumbers.findMagicNumbers(limit)

    println("Magic number counts by number of digits:")
    magicNumbers.foreach {
      case (digits, numbers) => println(s"$digits: ${numbers.size}")
    }

    val totalMagicNumbers = magicNumbers.values.flatten.size
    val largestMagicNumber = magicNumbers.values.flatten.max

    println(s"Total: $totalMagicNumbers magic numbers")
    println(s"Largest is $largestMagicNumber")

    val (pandigital1to9, pandigital0to9) = MagicNumbers.findPandigitalMagicNumbers(magicNumbers.values.flatten.toList)
    println(s"Minimally pandigital 1-9 magic numbers: $pandigital1to9")
    println(s"Minimally pandigital 0-9 magic numbers: $pandigital0to9")
  }
}