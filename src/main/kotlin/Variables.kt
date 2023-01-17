//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}


//variables
// var= global  and val= only 1 time assignable variable
var name: String="Chistia"
var ID: String?=null
fun main(){


    name="Maliha"
    ID="20101478"
    println(name)
    println(ID)


    var a=1
    if (a==1){
        println("okay")
    }
    else{
        println("meow")
    }

    //Switch in java=== when in kotlin
    when(name){
        null -> println ("Chistia")
        else -> println("maliha")
    }

    //if statement with local variable
    var greeting: String?= null
    val newYear= if(greeting!=null) "new" else  "old"
    println(newYear)

    val oldYear= when (name){
        null-> "Very bad"
        else-> "goooood"
    }
    println(oldYear)
}



