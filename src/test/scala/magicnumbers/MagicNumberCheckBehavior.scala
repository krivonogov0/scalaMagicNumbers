package magicnumbers

import org.scalatest.flatspec.AnyFlatSpec

trait MagicNumberCheckBehavior { this: AnyFlatSpec =>

  private val validMagicNumber = 1868587
  private val invalidMagicNumber = 12345

  def magicNumberValidationChecker(): Unit = {
    "A valid magic number" should "return true" in {
      assert(MagicNumbers.isMagicNumber(validMagicNumber))
    }

    "An invalid magic number" should "return false" in {
      assert(!MagicNumbers.isMagicNumber(invalidMagicNumber))
    }
  }

  def magicNumberEdgeCaseChecker(): Unit = {
    "The smallest magic number" should "return true" in {
      assert(MagicNumbers.isMagicNumber(1))
    }

    "Zero as a magic number" should "return false" in {
      assert(!MagicNumbers.isMagicNumber(0))
    }
  }
}