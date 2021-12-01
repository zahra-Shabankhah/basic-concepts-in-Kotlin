fun main(){
    val name:String? = null

    //model 1
    if (name != null) {
        println(name.length)
    }

    //model 2
    name?.let { println(name.length) }


    //model 3
    println(name?.length)


}