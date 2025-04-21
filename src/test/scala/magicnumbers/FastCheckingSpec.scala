package magicnumbers

import org.scalatest.flatspec.AnyFlatSpec

class FastCheckingSpec extends AnyFlatSpec {
  "Magic number checker" should "verify small magic numbers quickly" in {
    assert(MagicNumbers.isMagicNumber(1868587))
    assert(!MagicNumbers.isMagicNumber(12345))
  }

  "Magic number checker" should "handle edge cases" in {
    assert(MagicNumbers.isMagicNumber(1))
    assert(!MagicNumbers.isMagicNumber(0))
  }
}