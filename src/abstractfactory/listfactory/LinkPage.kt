package abstractfactory.listfactory

import abstractfactory.factory.Page

class LinkPage(title:String,author:String): Page(title,author){

    override fun makeTHML(): String {
        val sb = StringBuffer().apply {
            append("<html>head><meta charset=\"UTF-8\"><title>$title</title></head>\n")
            append("<body>\n")
            append("<h1>$title</h1>\n")
            append("<ul>\n")

            content.forEach {
                append(it.makeHTML())
            }

            append("</ul>\n")
            append("<hr><address>$author</address>")
            append("</body></html>\n")
        }

        return sb.toString()
    }
}