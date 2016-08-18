package org.anand

/**
  * Created by devlopment on 18/08/16.
  */
object tailRecurssion {
  def factorial(n: Int) = {
    def accumulator(acc: Int, n: Int): Int =
      if (n == 0) {
        acc
      } else {
        accumulator(acc * n, n-1);
      }
    accumulator(1, n);
  }
}
