package com.farrellw.hwe

import org.scalatest.FunSpec

class OptionEitherTests extends FunSpec {
  describe("dog age") {
    it("should return none when none is given") {
      // given
      val humanAge = None
      val expected = None
      // when
      val actual = OptionEither.dogAge(humanAge)
      // then
      assert(actual === expected)
    }

    it("should return correct dog age") {
      // given
      val humanAge: Option[Int] = Some(4)
      val expected = Some(38)
      // when
      val actual = OptionEither.dogAge(humanAge)
      // then
      assert(actual === expected)
    }
  }

  describe("Average Temperatures List") {
    it("Should return the average temprature"){
      val temperatures: List[Option[Int]] = List(Some(10), Some(40), None, Some(20), None, None, Some(30))
      val expected = Some(25)

      val actual = OptionEither.averageTemperature(temperatures)
      assert(actual.isDefined)
      assert(actual.get === expected.get)
    }

    it("Should return None when the list doesn't contain any"){
      val temperatures: List[Option[Int]] = List(None, None, None)
      val expected = None

      val actual = OptionEither.averageTemperature(temperatures)
      assert(actual.isEmpty)
    }
  }

  describe("Create customer") {
    it("Should return a customer when valid name and username are passed in") {
      val name = Some("Will")
      val username = Some("farrellw")
      val height = Some(42)

      val actual = OptionEither.createCustomer(name, username, height)
      assert(actual.isRight)
    }

    it("Should return an exception when a None username or name is passed in") {
      val name = None
      val username = Some("farrellw")
      val height = Some(42)

      val actual = OptionEither.createCustomer(name, username, height)
      assert(actual.isLeft)
    }
  }

  describe("Roller Coster Height Checker") {
    it("Should return an exception when customer is not high enough"){
      val height = 42
      val c = Customer("Will", "farrellw", height)
      val expected = Left("Customer not tall enough")

      val actual = OptionEither.rollerCoasterHeightChecker(c)
      assert(actual.isLeft)
    }

    it("Should return the customer when it's high enough"){
      val height = 52
      val c = Customer("Will", "farrellw", height)
      val expected = c

      val actual = OptionEither.rollerCoasterHeightChecker(c)
      assert(actual === expected)
    }
  }
}