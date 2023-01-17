

fun main() {
    //arrayOf
    val interestingThings= arrayOf("Kotlin","programming","comic books")
    println(interestingThings.size)
    println(interestingThings[1])
    println(interestingThings.get(1))


    println("----------------------1")

    for (i in interestingThings){
        println(i)
    }

    println("----------------------2")

    interestingThings.forEach {
        println(it)
    }

    println("----------------------3")

    interestingThings.forEach { interest ->
        println(interest)
    }

    println("----------------------4")
    interestingThings.forEachIndexed { index, s ->
        println("$index $s")
    }



    //listOf: previous things + more functionality

    println("----------------------5")
    val newThings= listOf("meow","lala land","manga")
    println(newThings.get(0))

    val map= mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key $value")  }

    //for mutable or to be addable we need _
    println("----------------------6")
    val oldThings= mutableListOf("meow","lala land","manga")
    oldThings.add("panda")
    println(oldThings.get(3))

    val map1= mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map1.put(4, "d")
    map1.forEach { key, value -> println("$key $value")  }

    println("----------------------7")
    sayHello("Hello", newThings)

}

fun sayHello(greeting: String, itemsToGreet:List<String>){
    itemsToGreet.forEach { i->
        println("$greeting $i")
    }
}

