val testList = List("Thing", "thing2", "Thing", "woah")

println(testList.groupBy(word => word).map(word => (word._1 -> word._2.length)))