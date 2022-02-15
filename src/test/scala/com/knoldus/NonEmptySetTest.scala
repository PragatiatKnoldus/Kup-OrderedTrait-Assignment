package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class NonEmptySetTest extends AnyFlatSpec {

  val intSet: Set[IntSet] = new Empty[IntSet].incl(IntSet(8)).incl(IntSet(9))

  "incl method " should " insert the value 5,9 in set" in {
    assert(intSet.contains(IntSet(9)))
  }

  "contain method" should "give true if the value is present in set" in {
    assert(intSet.contains(IntSet(8)))
  }

  "contain method" should "give false if the value is not present in set" in {
    assert(!intSet.contains(IntSet(10)))
  }
}