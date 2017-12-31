package bridge

/**
 * 表示するクラス
 * @param impl 実装の委譲先
 */
open class Display(private val impl: DisplayImpl) {

    open fun open() {
        impl.rawOpen()
    }

    open fun print() {
        impl.rawPrint()
    }

    open fun close() {
        impl.rawClose()
    }

    fun display() {
        open()
        print()
        close()
    }
}