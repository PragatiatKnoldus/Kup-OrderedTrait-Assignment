package com.knoldus

class NonEmptySet[A <: Ordered[A]](value: A, left: Set[A], right: Set[A]) extends Set[A] {

  def contains(element: A): Boolean = {
    if (element == value) true
    else if (element < value) left.contains(element)
    else right.contains(element)
  }

  def incl(element: A): Set[A] = element match {
    case a if a < value => new NonEmptySet(element, left.incl(a), right)
    case b if b > value => new NonEmptySet(element, left, right.incl(b))
    case _ => this
  }
}