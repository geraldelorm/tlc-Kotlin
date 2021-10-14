import kotlin.random.Random

class RandomAgent(override val name: String, val double: Double) : Actor {


    override fun act(): Action {
        val random = Random.nextDouble(0.0, double)
        if (random < 0.5) {
            val action = NoAction()
            return action
        } else {
            val action = ForageAction()
            return action
        }
    }

    override fun perceive(vararg facts: Percept) {
    }

    override fun toString(): String {
        return "Name: $name "
    }
}