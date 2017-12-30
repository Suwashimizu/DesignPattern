package factorymethod

import factorymethod.idcard.IDCardFactory

fun main(args:Array<String>){
    val factory = IDCardFactory()
    val card1 = factory.create("たろう")
    val card2 = factory.create("次郎")
    val card3 = factory.create("さぶろう")

    card1.use()
    card2.use()
    card3.use()
}