fun main(){

    val c = Circles(3.0)
    println(c.computeArea())
}

interface Shape{
    fun computeArea():Double
}

class Circles(val radius:Double): Shape{
    override fun computeArea() = Math.PI * radius * radius   // same with:    override fun computeArea() { Math.PI * radius * radius }


}