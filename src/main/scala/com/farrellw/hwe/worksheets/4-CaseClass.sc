case class Candy(name: String, sweet: Boolean, salty: Boolean, chocolatey: Boolean)

case class Person(name: String, height: Int, favoriteCandy: Candy)

val c = Candy("Skittles", sweet = true, salty = false, chocolatey = false)

val p = Person("Will", 6, c)