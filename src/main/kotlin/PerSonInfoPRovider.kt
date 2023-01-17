interface PerSonInfoPRovider {

    fun printInfo(person: Person)

}


class BasicInfoProvider: PerSonInfoPRovider {
    override fun printInfo(person: Person) {
        println("basic info provider")
        person.printInfo()
    }
}

fun main() {
    val provider= BasicInfoProvider()
    provider.printInfo(Person())
}