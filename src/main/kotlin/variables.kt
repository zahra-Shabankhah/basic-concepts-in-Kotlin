fun main() {

    val num1 = 1..5  //1 2 3 4 5
    val num12 = 1.rangeTo(5) //1 2 3 4 5

    val num2 = 23 downTo 19 //23 22 21 20 19
    val num21 = 23.downTo(19)  //23 22 21 20 19

    val num3 = 23 downTo 19 step 2  //23 21 19

    val num4 = 'a'..'z'

    val idNumber = 40

    if (idNumber in 1..100){
        println("ok")
    }

}