package mediator

class CollegureTextField : Colleague {

    override lateinit var mediator: Mediator
    override var colleagueEnabled: Boolean = false
    set(value) {
        field = value
        changeBackgroundColor()
    }

    var text:String = ""
    private set

    /**
     * 文字列が変化したらMediatorに通知
     */
    fun textValueChanged(event:String){
        mediator.colleagueChanged()
    }

    private fun changeBackgroundColor(){
        if(colleagueEnabled) println("red") else println("blue")
    }
}