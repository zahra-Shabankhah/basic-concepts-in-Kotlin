// HighOrderFuncLamda means : use a function as input instead of variable

// https://dl.fanavari.co/A16/A16-02-11%20fanavari.co%20android%20kotlin%20lambda%20fuctions.mp4
// https://dl.fanavari.co/A16/A16-02-12%20fanavari.co%20android%20kotlin%20lambda%20functions%20more.mp4

fun main() {

    var dirtyLevel = 20

    val WaterFilter = { level: Int -> level / 2 }

    println(WaterFilter(dirtyLevel))

    val program = Program()
    //model 1
    program.addTwoNumber(2, 7)

    //model 2
    program.addTwoNumber(2, 7, object : MyInterface {
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    //model 3
    val myLamda:(Int)-> Unit ={s:Int -> println(s)}
    program.addTwoNumber(2,7,myLamda)
}

class Program {
    fun addTwoNumber(a: Int, b: Int) {
        var sum = a + b
        println(sum)
    }

    fun addTwoNumber(a: Int, b: Int, action: MyInterface) {
        var sum = a + b
        action.execute(sum)
    }

    fun addTwoNumber(a: Int, b: Int, action: (Int) -> Unit){
        var sum = a + b
        action(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}