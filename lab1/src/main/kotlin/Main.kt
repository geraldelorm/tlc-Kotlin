fun main(args: Array<String>) {
    println("*********Q1*********")
    println("Hello, World!")
    println("--------------------")


    println("*********Q2*********")
    var text : String = "Hello!"
    println(text)
    println("--------------------")

    fun calculateY(m : Int, x : Int, c : Int) : Int {
        // y = mx + c - formula for a straight line
        return m * x + c
    }


    println("*********Q3*********")
    for (x in -5..5 ){
        println(calculateY(3, x,-1))
    }
    println("--------------------")


    println("*********Q4*********")
    for (x in 1..19){
        if (calculateY(3,x,5) == calculateY(4,x,2)){
            println("They intersect at $x")
            println("")
            println(calculateY(3,x,5))
            println(calculateY(4,x,2))
        }
    }
    println("--------------------")


    println("*********Q5*********")
    fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
        // This function takes the equations of two lines:
        for (x in 1..99){
            var yOne : Int = mOne * x + cOne
            var yTwo : Int = mTwo * x + cTwo

            if (yOne != yTwo){
                println("Don't intersect")
            } else{
                println("They intersect where X = $x")
            }
        }
    }
    intersection(3, 5,4,2)
    println("--------------------")
    intersection(2, 1,3,3)
    println("--------------------")
    intersection(-2, 3,3,-2)
    println("--------------------")

}