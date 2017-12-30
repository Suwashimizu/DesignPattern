package abstractfactory.listfactory

import abstractfactory.factory.Link

class ListLink(caption:String,url:String) : Link(caption,url){
    override fun makeHTML(): String =
            """
                <li><a href="$url">$caption</a></li>
            """
}