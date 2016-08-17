package org.anand

/**
  * Sqare root algorithm with newtons method.
  */
object newtonsSquareRoot {
  def sqrt(x: Double) = {
    def abs(x: Double) = if(x < 0) -x else x

    def squareItr(guess: Double) : Double =
      if (isGoodEnough(guess)) {
        guess
      } else {
        squareItr(improve(guess))
      }

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + (x / guess)) / 2

    squareItr(1.0);
  }

}
