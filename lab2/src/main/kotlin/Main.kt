var funds : Double = 100.0
val pswd = "password"

//Q1
fun main() {
    var input : String
    var cmd : List<String>

    fun balance() : Unit{
        println(funds)
    }

    fun deposit(double: Double) {
        funds += double;
        println(funds)
    }

    fun withdraw(double: Double) {
        print("Enter Password: ")
        val pass = readLine()!!

        if (pass == pswd) {
            if (double > funds){
                println("Not enough funds")
            } else {
                funds -= double;
                println(funds)
            }
        } else {
            println("password Don't match")
        }
    }

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")

        when (cmd[0]) {
            //Q2
            "balance" -> balance();
            //Q3 & 5
            "deposit" -> {
                    if (cmd.size == 2) {
                        try {
                            deposit(cmd[1].toDouble())
                        } catch (e: Exception){
                            println("Input can't to converted to double")
                        }
                    }else {
                        println("Add a valid amount to deposit")
                    }}

            //Q4 & 5 
            "withdraw" -> {
                    if (cmd.size == 2) {
                        try {
                            withdraw(cmd[1].toDouble())
                        } catch (e: Exception){
                            println("Input can't to converted to double")
                        }
                    }else {
                        println("Add a valid amount to withdraw")
                    }}
            else -> println("Invalid command")
        }
    }
}
