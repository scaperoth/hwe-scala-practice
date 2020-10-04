package com.farrellw.hwe.exercises

object Miscellaneous {
  /*
    Given a list of Option[Ints], returns the minimum of the Ints provided.
    If no ints are provided, return None.
   */
  def minimum(l: List[Option[Int]]): Option[Int] = ???


  /*
    Checks if an attempted password is valid or invalid.
    Password must contain at least one lowercase or one uppercase letter.
    Password must be over 8 long.
    A valid password returns the password back.
    An invalid password returns an exception.
   */
  def acceptablePassword(s: String): Either[Exception, String] = ???

  /*
    Checks if a string is palindrome.
   */
  def isPalindrome(s: String): Boolean = ???


}
