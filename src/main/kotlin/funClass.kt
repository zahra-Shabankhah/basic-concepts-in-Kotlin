import java.util.*

fun main() {

    fun driving(Speed : String = "45"){   // 45 = meghdare vorudie default hast
        println("Speed is $Speed")
    }

    driving("34")
    driving()



    //*****

    fun randomDay():String{
        val week = arrayOf("samstag","sonntag","freitag","montag","dienstag","mittwoch","donnerstag")
        val day = week[Random().nextInt(week.size)]
        return  day

    }
    fun fishfood(){
        val day = randomDay()
        var food = "kartoffel"
        when(day){
            "samstag" -> food= "supe"
            "sonntag" -> food= "düner"
            "freitag"-> food= "pitza"
        }
        println("$day haben wir $food für Mittag essen")
    }

    fishfood()

}