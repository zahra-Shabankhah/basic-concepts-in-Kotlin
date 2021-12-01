fun main() {
    //Example 1
    var ints = listOf(1, 2, 3, 4, 5)

    var intFilter = ints.filter { it > 3 }
    //Or :
    // var intFilter = ints.filter { n:Int -> n>3 }
    println(intFilter)


    //Example 2
    var books = listOf("biology", "nature", "best collection", "politic")
    var bookFilter = books.filter { it[0] == 'b' }  // filter kon item hyi ke harfe avaleshun 'b' hast
    println(bookFilter)


    //Example 3
    var myNumbers: List<Int> = listOf(1, 2, 34, 4, 70, 27, 18, 90)
    var smallNambers = myNumbers.filter { it > 30 }
    println(smallNambers)

    var doubleAmount = smallNambers.map { it * it }   // map yani amaliyati ke migam ro anjam bede
    println(doubleAmount)

    //estefadeye tarkibi az map va filter
    var combineAmount = myNumbers.filter { it < 20 }
        .map { it * it } //filter kon items<20 va (bad az filter)meghdareshun ro zarb dar khodeshun kon!!!
    println(combineAmount)

    //Example 4
    var humans = listOf(Human(32, "sara"), Human(28, "mary"), Human(12, "rosa"), Human(17, "melody"))
    var humansWithM = humans.filter { it.name.startsWith("m") }
    var humansWithSA = humans.filter {it.name.endsWith("sa") }

    for (item in humansWithM){
        println(item.name)
    }
    for (item in humansWithSA)    println(item.name)


    //Example 5
    println("Example 5")
    var myNums: List<Int> = listOf( 2, 34, 4, 70, 27, 18, 90,42,12)
    val check1 : Boolean = myNums.all { it < 30 } // yani hameye item haye myNums kuchiktr az 30 hastan?
    println(check1)
    val check2 : Boolean = myNums.all { it > 1 }  // yani hameye item haye myNums bozorgrat az 1 hastan?
    println(check2)
    val check3 : Boolean = myNums.any{it>0}  // check3 is true when any item is not greater than 0
    println(check3)
    val totalCount : Int = myNums.count{it> 10}  //beshmar tedade adad haye bozorgrat az 10 ro
    println(totalCount)

    val myPredicate = {item:Int-> item>10}
    val num : Int? = myNums.find (myPredicate) // avalin item bozorgtar az 10 ro return mikone(find mikone)
    println(num)


}
class Human(var age: Int, var name: String) {

}
