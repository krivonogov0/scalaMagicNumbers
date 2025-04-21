package magicnumbers

object TestValuesObject {

  val validMagicNumbers: List[BigInt] = List(
    1, 1868587, 18, 186, 1868, 18685, 186858
  )

  val invalidMagicNumbers: List[BigInt] = List(
    12345, 999999, 0, 111111
  )

  val edgeCaseMagicNumbers: List[BigInt] = List(
    BigInt("1000000000000000000000001"),
    BigInt("3608528850368400786036725")
  )

}