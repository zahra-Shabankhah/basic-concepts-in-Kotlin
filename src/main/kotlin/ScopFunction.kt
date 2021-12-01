fun main() {
    var person = Person()

    // یک روش استفاده از کلاس استفاده از متد آماده (with)است
    with(person) {
        name = "Mary"
        age = 30
        println("$name  $age")
    }

    // یک روش استفاده از کلاس استفاده از متد آماده (apply)است
    Person().apply {
        this.name = "Sara"
        this.age= 20
        println("$name  $age")
    }

    //or
    val person1 = Person().apply {
        this.name = "Sara"
        this.age= 20
        println("$name  $age")
    }

    // یک روش استفاده از کلاس استفاده از متد آماده (also)است
    val person2 = person.also {
        it.name="Lena"
        it.age=10
        println("${it.name}  ${it.age}")
    }

}

class Person() {
    var name: String = ""
    var age: Int = 18

}