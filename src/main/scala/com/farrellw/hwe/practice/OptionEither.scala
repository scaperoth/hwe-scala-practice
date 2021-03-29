package com.farrellw.hwe.practice

case class Item(description: String, price: Option[Int])

case class WeatherStation(name: String, temperature: Option[Int])

object OptionEither {
  /*
    Returns age of a dog when given a human age.
    Returns None if the input is None.
  */
  def dogAge(humanAge: Option[Int]): Option[Int] = {
    humanAge match {
      case Some(humanAge) => Some(humanAge * 7)
      case _ => None
    }
  }

  /*
    Returns the total cost af any item.
    If that item has a price, then the price + 7% of the price should be returned.
  */
  def totalCost(item: Item): Option[Double] = {
    val price = item.price getOrElse None
    price match {
      case i: Int => Some(i * 1.07)
      case _ => None
    }
  }

  /*
    Given a list of weather temperatures, calculates the average temperature across all weather stations.
    Some weather stations don't report temperature
    Returns None if the list is empty or no weather stations contain any temperature reading.
   */
  def averageTemperature(temperatures: List[WeatherStation]): Option[Int] = {
    val checks = List(
      temperatures.length == 0,
      temperatures.forall(_.temperature == None)
    )
    if(!checks.forall(_ == false)){
      return None
    }
    val temps = temperatures.filter(_.temperature != None)
    Some(temps.foldLeft(0)(_ + _.temperature.getOrElse(0))/(temps.length))
  }
}
