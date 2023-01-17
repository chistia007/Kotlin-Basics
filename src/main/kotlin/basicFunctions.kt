//Our own function
fun myOwn(): String?{
    return "Hello kotlin"
}
//single function expression:
 fun getSome()= "Hello Kotlin1"

fun sayHello(){
    println(myOwn())
}

fun parameterFunction(itemToGet:String,itemToGet1:String){
    val msg="$itemToGet1 $itemToGet"
    println(msg)
}
//single function expression:
// fun parameterFunction(itemToGet:String)=println("Hello $itemToGet")

fun main() {
    println("hello world")
    println("--------------------------------------")
    println(myOwn())
    sayHello()
    println(getSome())

    parameterFunction("Hello"," Ck")
}
