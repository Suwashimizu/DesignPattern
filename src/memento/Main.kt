package memento

import memento.game.Gamer

/**
 * Caretaker
 *
 * Originator役の状態を保存したい時にOriginatorに伝える
 * Originatorはそれを受けてmementoを作り
 * caretakerに渡す
 * caretakerはmementoを保存しておく
 *
 * Caretakerはnarrow interfaceしか使えないので
 * 内部情報にアクセスは出来ない
 */
fun main(args: Array<String>) {

    val gamer = Gamer(100)
    var mement = gamer.createMemento()

    IntRange(0, 100).forEach {
        println("====$it")
        println("現状:$gamer")

        //ゲームを進める
        gamer.bet()

        println("所持金は${gamer.money}円になりました")

        //mementoの取扱の決定
        if (gamer.money > mement.money) {
            println("だいぶ増えたので保存しておこう")
            mement = gamer.createMemento()
        } else if (gamer.money < mement.money / 2) {
            println("だいぶ減ったので以前の状態に復元しよう")
            gamer.restoreMemento(mement)
        }

        Thread.sleep(1000)
    }
}