package com.farrellw.hwe

import org.scalatest.FunSpec

class OptionEitherTest extends FunSpec {
  describe("dog age") {
    it("should return none when none is given") {
      val humanAge = None
      val expected = None

      val actual = OptionEither.dogAge(humanAge)
      assert(actual === expected)
    }

    it("should return correct dog age") {
      val humanAge: Option[Int] = Some(4)
      val expected = Some(28)

      val actual = OptionEither.dogAge(humanAge)
      assert(actual === expected)
    }
  }

  describe("Average Temperatures List") {
    it("Should return the average temprature"){

      val temperatures: List[WeatherStation] = List(WeatherStation("Baltimore", Some(10)), WeatherStation("Seattle", Some(40)), WeatherStation("St. Louis", None), WeatherStation("Chicago", Some(20)), WeatherStation("Omaha", None), WeatherStation("Atlanta", None), WeatherStation("LA", Some(30)))
      val expected = Some(25)

      val actual = OptionEither.averageTemperature(temperatures)
      assert(actual.isDefined)
      assert(actual.get === expected.get)
    }

    it("Should return None when the list doesn't contain any"){
      val temperatures: List[WeatherStation] = List(WeatherStation("St. Louis", None), WeatherStation("Omaha", None), WeatherStation("Atlanta", None))

      val actual = OptionEither.averageTemperature(temperatures)
      assert(actual.isEmpty)
    }
  }

}
