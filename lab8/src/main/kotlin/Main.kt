fun main(args: Array<String>) {

    //Q1
    tailrec fun factorial(n : Int) : Int = if (n<0) 0 else when(n) {
        0, 1 -> 1
        else -> n * factorial(n -1)
    }
    val fac5 = factorial(5)
    println(fac5)
    println("------------")

    //Q2
    val doubleNum : (Int) -> Int = { i : Int -> i*2}
    //type is int to int
    println(doubleNum(50))

    //Q3


    //Q4


    //Q5
}