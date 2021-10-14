class SimpleAgent(override val agentName: String) : Actor{
    override fun act(): Action {
        val action = ForageAction()
        return action
    }

    override fun perceive(vararg facts: Percept) {
    }

    override fun toString(): String {
        return "Name: $agentName"
    }

}