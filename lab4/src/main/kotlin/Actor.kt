interface Actor {
    val agentName : String
    fun act() : Action
    fun perceive(vararg facts : Percept) : Unit
}