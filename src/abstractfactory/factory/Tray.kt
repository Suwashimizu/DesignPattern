package abstractfactory.factory

/**
 * 復数のLinkやTrayを集めてひとまとまりにしたものを表す
 */
abstract class Tray(caption:String):Item(caption) {

    protected val tray = mutableListOf<Item>()

    fun add(item:Item){
        tray.add(item)
    }
}