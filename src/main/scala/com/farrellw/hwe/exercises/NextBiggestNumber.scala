package com.farrellw.hwe.exercises

object NextBiggestNumber {

  /*
  For a given number, return the next largest number that can be created by rearranging that number's digits.
  If no larger number can be created, return -1
   */
  def getNextBiggestNumber(i: Integer): Int = {
    val perms = permutationsOfInt(i)

    perms.foldLeft(-1)((agg, next) => {
      if ((next < agg || agg == -1) && next > i) {
        next
      } else {
        agg
      }
    })
  }

  def permutationsOfInt(i: Integer): List[Int] = {
    val s = i.toString
    val a = s.split("")
    a.permutations.toList.map(_.foldLeft("")((agg, next) => {
      agg + next
    })).map(_.toInt)
  }
}
