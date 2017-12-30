package abstractfactory.factory

import java.io.FileWriter

abstract class Page(val title:String,val author:String) {

    protected val content = mutableListOf<Item>()

    /**
     * @param item linkかtrayが追加される。追加されたものをPageで描画する
     */
    fun add(item:Item){
        content.add(item)
    }

    fun output(){
        try {
            val filename = "$title.html"
            val writer = FileWriter(filename)
            writer.write(makeTHML())
            writer.close()

            println("$filename を作成しました。")
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    abstract fun makeTHML():String
}