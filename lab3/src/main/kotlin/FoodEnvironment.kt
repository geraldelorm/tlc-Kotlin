class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
    val scores : MutableMap<Actor, Int> = mutableMapOf()

    init {
        scores.withDefault { 0 };
    }

    override fun processAction(agent: Actor, act: Action) {
        when(act ){
            is ForageAction -> scores.merge(agent, 1,Int::plus)
        }
    }

    override fun sense(agent: Actor) {

    }

}