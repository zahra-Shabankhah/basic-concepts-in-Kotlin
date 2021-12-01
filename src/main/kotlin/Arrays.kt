fun main() {
    val pets = arrayOf("dog","cat","rabbit")

    //model 1   print array's elements
    println("model 1")
    for(elements in pets) {
        println(elements)
    }

    //model 2   print array's elements
    println("model 2")
    pets.forEach { System.out.println(it) }


    //or
    println("model 3")
    println(pets[0])
    println(pets[1])
    println(pets[2])

    //0r ******
    println("model 4")
    for ((index, element) in pets.withIndex()){
        println("item at $index is $element")
    }


}