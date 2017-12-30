package mediator

class ColleaueButton : Colleague {
    override lateinit var mediator: Mediator
    override var colleagueEnabled: Boolean = false
}