package magicnumbers

import org.scalatest.flatspec.AnyFlatSpec

class RegularCheckingSpec extends AnyFlatSpec {
  "Magic number checker" should "verify correctness of magic numbers" in {
    assert(MagicNumbers.isMagicNumber(1868587))
    assert(MagicNumbers.isMagicNumber(1))
  }

  "Magic number checker" should "fail for non-magic numbers" in {
    assert(!MagicNumbers.isMagicNumber(12345))
    assert(!MagicNumbers.isMagicNumber(999999))
  }
}