package mediator

class CollegureCheckbox : Colleague {

    override lateinit var mediator: Mediator
    override var colleagueEnabled: Boolean = false

    var state:Boolean = true

    fun itemStateChanged(event:Boolean){
        mediator.colleagueChanged()
    }
}