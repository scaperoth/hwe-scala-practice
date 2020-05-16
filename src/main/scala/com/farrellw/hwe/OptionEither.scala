package com.farrellw.hwe

case class Customer(name: String, username: String, height: Int)

object OptionEither {
  // Returns age of a dog when given a human age. Returns None if the input is none.
  def dogAge(humanAge: Option[Int]): Option[Int] = ???

  // Given a list of Option Ints, Calculates the average temperature of the Option[Ints]
  // Returns None if the list is empty or doesn't contain any Ints
  def averageTemperature(temperatures: List[Option[Int]]): Option[Int] = ???

  // If both name and username exist, return a Customer.
  // If either do not exist, throw an exception.
  def createCustomer(name: Option[String], username: Option[String], height: Option[Int]): Either[Exception, Customer] = ???

  //  Checks to see if the age of a roller coaster rider is above 50 inches
  def rollerCoasterHeightChecker(customer: Customer): Either[Exception, Customer] = ???
}