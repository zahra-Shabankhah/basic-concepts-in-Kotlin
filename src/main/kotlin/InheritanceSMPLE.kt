// inheritance
// override

fun main(){

    var dog = Dog()
    dog.bark()
    dog.eat()
    dog.color = "white"
}

open class Animals{
    var color : String = ""
    open fun eat(){
        println("eat")
    }
}

// class nameClass : super class or parent class
class Dog: Animals() {
    var bread : String= ""
    fun bark(){
        println("Bark")
    }

    override fun eat(){
        super<Animals>.eat()
        println("dog is eating")
    }
}

class Cat: Animals() {
    var age : Int= 1
    fun meow(){
        println("Meow")
    }
}
