import java.util.Random as jRan
import kotlin.random.Random as kRan

fun main(args: Array<String>) {
    var jScore: Int = 0
    var kScore: Int = 0
    for (i in 1..1000){
        val javaRan : Int = jRan().nextInt()
        val kotlinRan : Int = kRan.nextInt()

        if (javaRan > kotlinRan){
            jScore++
        } else{
            kScore++
        }
    }

    println("Java Random was higher $jScore times")
    println("Kotlin Random was higher $kScore times")
}
