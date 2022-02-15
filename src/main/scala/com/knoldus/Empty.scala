package com.knoldus

class Empty[A <: Ordered[A]] extends Set[A] {
  def contains(value: A): Boolean = false

  def incl(value: A): Set[A] = new NonEmptySet(value, new Empty[A], new Empty[A])
}