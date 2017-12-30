package abstractfactory.listfactory

import abstractfactory.factory.Tray

class LinkTray(caption:String) : Tray(caption){

    override fun makeHTML(): String {
        val sb = StringBuffer().apply {
            append("<li>\n")
            append("${super.caption}\n")
            append("<ul>\n")

            tray.forEach {
                append(it.makeHTML())
            }
            append("</ul>\n")
            append("</li>\n")
        }

        return sb.toString()
    }
}