package memento.game

import java.util.*

/**
 * Originator
 * 状態を保存したい時にmemento役を生成する
 * mementoを渡されると以前の状態を復元する
 */
class Gamer(money:Int) {

    companion object {
        private val fruitsname = listOf("リンゴ","ぶどう","バナナ","みかん")
    }

    var money:Int = money
    private set

    private var fruits = mutableListOf<String>()
    private val random = Random()

    fun bet(){
        val dice = random.nextInt(6) + 1
        when(dice){
            1 -> {
                money += 100
                println("所持金が増えました")
            }
            2 -> {
                money /= 2
                println("所持金が減りました")
            }
            6 -> {
             val f = getFruit()
                println("フルーツ${f}をもらいました")
                fruits.add(f)
            }
            else -> {
                println("何も起こりませんでした")
            }
        }
    }

    //スナップショットを撮る
    fun createMemento():Memento{
        val m = Memento(money)

        fruits.forEach {
            if(it.startsWith("おいしい")){
                m.addFruit(it)
            }
        }

        return m
    }

    //アンドゥを行う
    fun restoreMemento(memento: Memento){
        this.money = memento.money
        this.fruits = memento.getFruits().toMutableList()

        println(memento.getFruits())
    }

    private fun getFruit():String{
        val prefix = if(random.nextBoolean()) "おいしい" else ""

        return prefix + fruitsname[random.nextInt(fruitsname.size)]
    }


    override fun toString(): String {
        return "[money = $money , fruits = $fruits]"
    }

}