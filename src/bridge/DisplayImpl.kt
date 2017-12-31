package bridge

/**
 * 実装のクラス階層
 * 実装のクラス階層の最上位に位置する
 */
interface  DisplayImpl {
    /**
     * 前処理
     */
    fun rawOpen()

    /**
     * 表示
     */
    fun rawPrint()

    /**
     * 後処理
     */
    fun rawClose()
}