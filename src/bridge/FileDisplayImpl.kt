package bridge

import java.io.File
import kotlin.math.max

class FileDisplayImpl(filePath: String) : DisplayImpl {

    private val file = File(filePath)
    private val lines: List<String>
    private val maxWidth: Int

    init {
        //Fileの全テキスト取得
        lines = file.readLines()

        //行で見た時に最大の文字数を取得
        maxWidth = lines.maxBy { it.length }?.length ?: 0
    }

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        lines.forEach {
            //最大文字数に合わせるためのスペース
            val space = IntRange(1,maxWidth - it.length).mapNotNull { "  " }.joinToString(separator = "")
            //前後に|を付けて表示
            println("|$it$space|")
        }
    }

    override fun rawClose() {
        printLine()
    }


    private fun printLine() {
        print("+")
        for (i in 0 until maxWidth*2) {
            print("-")
        }
        println("+")
    }
}