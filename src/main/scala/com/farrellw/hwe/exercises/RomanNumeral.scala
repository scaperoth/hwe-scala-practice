package com.farrellw.hwe.exercises

// NOTE - For simplicity sake, solve assuming old roman numeral style. 4 is IIII and NOT IV
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
    "C" -> 100,
    "L" -> 50,
    "X" -> 10,
    "V" -> 5,
    "I" -> 1
  )

  /*
    Given a roman numeral ( e.g. CCX ), returns the numerical equivalent ( e.g. 210 ).
    If the roman numeral contains any invalid roman numerals, returns None.
    // NOTE - For simplicity sake, solve assuming old roman numeral style. 4 is IIII and NOT IV
   */
  def convertRomanToInt(s: String): Option[Int] = {
    val keysExist = s.forall(c => ROMAN_TO_INT.contains(c.toString))
    if(keysExist) {
      Some(s.foldLeft(0)((acc, c) => acc + ROMAN_TO_INT.getOrElse(c.toString, 0)))
    }else{
      None
    }
  }

  /*
    Given a complete roman numeral ( e.g. CCX ), returns the numerical equivalent ( e.g. 210 ).
    If the roman numeral contains any invalid roman numerals, return an exception
    // NOTE - For simplicity sake, solve assuming old roman numeral style. 4 is IIII and NOT IV
   */
  def convertRomanToIntEither(s: String): Either[Exception, Int] = {
    val keysExist = s.forall(c => ROMAN_TO_INT.contains(c.toString))
    if(keysExist) {
      println(s"RIGHT! $s -- $keysExist")
      Right(s.foldLeft(0)((acc, c) => acc + ROMAN_TO_INT.getOrElse(c.toString, 0)))
    }else{
      println("LEFT!")
      Left(new Exception(s"Invalid Numeral: $s"))
    }
  }

  /*
    Given a number, return the roman numeral equivalent
   */
  def convertIntToRoman(i: Int): Option[String] = ???
}
