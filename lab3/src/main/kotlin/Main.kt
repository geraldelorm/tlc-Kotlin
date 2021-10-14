fun main() {
    val env = FoodEnvironment(SimpleAgent("Charlie"))
    env.step()
    println(env.scores)

    println("--------------------------")

    val env2 = FoodEnvironment(RandomAgent("Charlie",0.8), RandomAgent("Bob", 0.2), RandomAgent("Alice", 0.6))
    for (i in 1..100)
        env2.step()
    println(env2.scores)
}