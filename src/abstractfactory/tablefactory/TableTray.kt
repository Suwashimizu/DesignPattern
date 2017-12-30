package abstractfactory.tablefactory

import abstractfactory.factory.Tray

class TableTray(caption:String) : Tray(caption){

    override fun makeHTML(): String {
        val sb = StringBuffer().apply {
            append("<tb>")
            append("<table width\"100%\" border=\"1\"><tr>")
            append("<tb bgcolor=\"#cccccc\" align=\"center\" colspan=\" ${tray.size} \"><b>$caption</b></td>")
            append("</tr>\n")
            append("<tr>\n")

            tray.forEach {
                append(it.makeHTML())
            }

            append("</tr></table>")
            append("</td>")
        }

        return sb.toString()
    }
}