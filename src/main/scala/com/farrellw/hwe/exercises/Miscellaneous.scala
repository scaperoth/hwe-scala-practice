package com.farrellw.hwe.exercises

object Miscellaneous {
  /*
    Given a list of Option[Ints], returns the minimum of the Ints provided.
    If no ints are provided, return None.
   */
  def minimum(l: List[Option[Int]]): Option[Int] = {
    l.flatten match {
      case Nil => None
      case xs => Some(xs.min)
    }
  }

  /*
    Checks if an attempted password is valid or invalid.
    Password must contain at least one lowercase or one uppercase letter.
    Password must be over 8 long.
    A valid password returns the password back.
    An invalid password returns an exception.
   */
  def acceptablePassword(s: String): Either[Exception, String] = {
    if(s.toLowerCase == s){
      Left(new Exception("No upper case letters"))
    }else if (s.toUpperCase == s){
      Left(new Exception("No lower case letters"))
    } else if (s.length < 8){
      Left(new Exception("Not long enough"))
    } else {
      Right(s)
    }
  }

  /*
    Checks if a string is palindrome.
   */
  def isPalindrome(s: String): Boolean = {
    s.reverse == s
  }
}
