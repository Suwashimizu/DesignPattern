package memento.game

/**
 * Gamerの状態を表現するクラス
 *
 * Memento
 * Originatorの内部情報を纏める
 * 内部情報を全て公開はせず
 *
 * wide interface
 * オブジェクトの状態をもとに戻すために必要な情報がすべてを得られるメソッドの集合
 * これを使えるのはOriginator役だけ
 *
 * narrow interface
 * 外部のCaretaker役にみせる、内部状態を外部に公開されるのを防ぐ
 *
 * 2種類のinterfaceを使い分けることでカプセル化の破壊を防ぐ
 *
 * kotlinは無名メソッドは無いのでwide interfaceは実現できてない(MainからaddFruitを呼び出せている)
 *
 * @param money narrow interface
 **/

class Memento(var money: Int) {
    private val fruits = mutableListOf<String>()

    /**
     * wide interface
     */
    fun addFruit(fruit: String) {
        fruits.add(fruit)
    }

    /**
     * wide interface
     */
    fun getFruits(): List<String> {
        return fruits.toMutableList()
    }

}