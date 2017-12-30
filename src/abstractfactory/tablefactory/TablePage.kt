package abstractfactory.tablefactory

import abstractfactory.factory.Page

class TablePage(title:String,author:String) : Page(title,author) {
    override fun makeTHML(): String {
        val sb = StringBuffer().apply {
            append("<html>head><meta charset=\"UTF-8\"><title>$title</title></head>\n")
            append("<body>\n")
            append("<h1>$title</h1>")
            append("<table width=\"80%\" border=\"3\">\n")

            content.forEach {
                append("<tr>${it.makeHTML()}</tr>")
            }

            append("</table>\n")
            append("<hr><address>$author</address>")
            append("</body></html>\n")
        }

        return sb.toString()
    }
}