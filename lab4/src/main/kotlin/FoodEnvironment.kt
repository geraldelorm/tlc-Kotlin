import kotlin.random.Random

class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
    val scores : MutableMap<Actor, Int> = mutableMapOf()
    var animal : String? = null

    init {
        scores.withDefault { 0 }
    }

    override fun step() {
        val random : Double = Random.nextDouble(0.0, 1.0)

        animal = if (random >= 0.5) {
            "Snake"
        } else {
            null
        }

        super.step()
    }

    override fun processAction(agent: Actor, act: Action) {
        when(act ){
            is ForageAction -> scores.merge(agent, 1,Int::plus)
            is HuntAction -> scores.merge(agent, 2,Int::plus)
        }
    }

    override fun sense(agent: Actor) {
        if (animal.isNullOrEmpty()) {
            agent.perceive()
        } else {
            agent.perceive(Percept("animal", animal.toString()))
        }
    }



}