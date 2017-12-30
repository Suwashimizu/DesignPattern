package mediator


/**
 * 相談役を表現する
 */
interface Mediator {

    /**
     * Mediatorが管理するメンバーを生成する
     */
    fun createColleague()

    /**
     * colleagueから呼び出される。状態が変化した際に呼ばれる
     */
    fun colleagueChanged()
}