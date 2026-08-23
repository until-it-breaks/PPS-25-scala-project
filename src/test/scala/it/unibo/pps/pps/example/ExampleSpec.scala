package it.unibo.pps.pps.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ExampleSpec extends AnyFlatSpec with Matchers:

  "A test" should "fail" in {
    1 + 1 shouldBe 2 // Test volutamente errato
  }