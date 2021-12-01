fun main() {
    //sample1
    for (num in 15 ..20){
        println(num)
    }

    //sample2
    for (num in 20.downTo(15)){
        println(num)
    }

    //sample3
    val pets = arrayOf("dog","cat","rabbit")
    for ((index, element) in pets.withIndex()){
        println("item at $index is $element")
    }

    //sample4
    for (i in 1..9){
        if (i==5) continue
        print(" $i")
    }
println()
    //sample5   ***adade fard

    for (i in 1..10){
        if (i%2==0) continue
        print("$i ")
    }
}