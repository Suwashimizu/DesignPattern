package bridge

/**
 * 文字列を表示するクラス
 *
 * @param string 表示する文字列
 */
class StringDisplayImpl(private val string: String) : DisplayImpl {

    private val width = string.length

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        //前後に|を付けて表示
        println("|$string|")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for (i in 0 until width) {
            print("-")
        }
        println("+")
    }
}