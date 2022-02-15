package com.knoldus

case class IntSet(value: Int) extends Ordered[IntSet] {
  def compare(that: IntSet): Int =
    if (this.value < that.value) -1
    else if (this.value > that.value) 1
    else 0
}