open class VisibilityModifires {

    public var a = 2
    private var b = 2
    protected var c = 2   //subClass behesh dast resi dare
    internal var d = 2


}

class AccessVisibilityModifires {
    fun testAccessVisibilityModifires(){
       var visibilityModifires= VisibilityModifires()
        visibilityModifires.a
      //  visibilityModifires.b
       // visibilityModifires.c
        visibilityModifires.d

    }

    class AccessProtected : VisibilityModifires(){
        fun test(){
            a
          //  b
            c
            d

        }
    }

}