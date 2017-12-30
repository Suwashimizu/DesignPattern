package abstractfactory.factory

/**
 * LinkとTrayを同一視するためのクラス
 *
 */
abstract class Item(protected val caption:String) {

    /**
     * HTMlの文字列が戻り値となる
     */
    abstract fun makeHTML() : String
}