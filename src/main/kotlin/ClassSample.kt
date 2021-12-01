fun main(){
    var student = Student("Melody")

    val aa= A()

    val bb=B(12)
   // println(bb.x)

    val cc=C(12)
    println(cc.y)

    val box1=Box(10,30)
    val box2=Box(width = 15)


    val circle1 = Circle(3.0)
    val circle2 = Circle(3) // counstrucrore default ham ejra mishe
    val circle3 = Circle("circle")   // counstrucrore default ham ejra mishe

    var sudent2 = Student("melody",32)
}



class Student(_name:String){
    var name:String = ""
    var id:Int = -1

    init {
        this.name = _name
        println("student's name is $name")
    }

    constructor(_n:String,_id:Int):this(_n){
        this.id=_id
        println("student has id too: $id")
    }


}

class A(){}

class B(x:Int){}

class C(val y:Int){}

class Box(val lenght:Int=30, val width:Int,val height:Int=40){}

class Circle(val radius:Double){

    // default constructor:(init is main constructor)
    init {
        println("Area of circle: ${Math.PI*radius*radius}")
    }

    constructor(diameter:Int) : this(diameter/2.0){
        println("in diameter constructor")
    }

    constructor(name:String) : this(1.0)

}