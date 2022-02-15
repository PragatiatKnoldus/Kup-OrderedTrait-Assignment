package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EmptyTest extends AnyFlatSpec {

  val empty = new Empty[IntSet]

  "Condition" should "give true if we insert an element in empty set"
  val updatedSet: Set[IntSet] = empty.incl(IntSet(8))
  assert(updatedSet.contains(IntSet(8)))
}