//class Person(val firstName:String, val lastName:String) {
//    init {
//        println("Init 1") }
//    //Secondary constructor
//    constructor():this("peter","parker"){
//        println("This is secondary constructor")
//    }
//    init {
//        println("Init 2")
//    }
//}

// Default values
//class Person(val firstName:String="Peter", val lastName:String="Parker") {
//
//}


class Person(val firstName:String="Peter", val lastName:String="Parker") {
    var nickName: String?=null
        set(value) {
            field=value
            println("the new nickname is $value")
        }
        get() {
            println("the return value is $field")
            return field
        }

    fun printInfo(){
        val printNick=if (nickName!=null) nickName else "no nickname"
        //or, val printNick=nickName?: "no nickname"
        println("$firstName $printNick $lastName")
    }
}