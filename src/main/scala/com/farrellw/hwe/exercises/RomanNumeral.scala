package com.farrellw.hwe.exercises

object RomanNumeral {
  /*
    Map containing the numerical value to its roman numeral equivalent.
   */
  val INT_TO_ROMAN: Map[Int, String] = Map[Int, String](
    1000 -> "M",
    500 ->  "D",
    100 ->  "C",
    50 ->  "L",
    10 ->  "X",
    5 ->  "V",
    1 ->  "I"
  )

  /*
    Map containing a roman numeral to its numerical value equivalent.
   */
  val ROMAN_TO_INT: Map[String, Int] = Map[String, Int](
    "M" -> 1000,
    "D" -> 500,
    "C" ->  100,
    "L" -> 50,
    "X" -> 10,
    "V" -> 5,
    "I" -> 1
  )

  /*
    Given a roman numeral ( e.g. CCX ), returns the numerical equivalent ( e.g. 210 ).
    If the roman numeral contains any invalid roman numerals, returns None.
   */
  def convertRomanToInt(s: String): Option[Int] = ???

  /*
    Given a complete roman numeral ( e.g. CCX ), returns the numerical equivalent ( e.g. 210 ).
    If the roman numeral contains any invalid roman numerals, return an exception
   */
  def convertRomanToIntEither(s: String): Either[Exception, Int] = ???

  /*
    Given a number, return the roman numeral equivalent
   */
  def convertIntToRoman(i: Int): Option[String] = ???
}
