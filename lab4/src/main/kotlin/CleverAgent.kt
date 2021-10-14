class CleverAgent(override val agentName: String) : Actor {
    var sense: Percept? = null

    override fun act(): Action {
        if (sense != null){
            return HuntAction(sense!!.value)
        } else {
            return ForageAction();
        }
    }

    override fun perceive(vararg facts: Percept) {
        for(fact in facts){
            sense = fact
        }
    }

    override fun toString(): String {
        return "CleverAgent(agentName='$agentName', sense=$sense)"
    }


}