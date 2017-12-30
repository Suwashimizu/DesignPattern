package abstractfactory

import abstractfactory.factory.Factory

/**
 * 具体的な工場(factory)を追加するのは簡単
 * 部品を新たに追加するのは困難、全てのFactoryClassにその部品のメソッドを追加する必要があるため
 */
fun main(args:Array<String>){
    if(args.size != 1){
        println("Usage: java Main class.name.of.ConcreteFactory.")
        println("Example 1: java Main abstractfactory.tablefactory.listfactory.ListFactory")
        println("Example 2: java Main abstractfactory.tablefactory.TableFactory.TableFactory")
        System.exit(1)
    }

    val factory = Factory.getFactory(args[0])

    val asashi = factory.createLink("朝日新聞","https://wwww.asahi.com")
    val yomiuri = factory.createLink("読売新聞","https://www.yomiuri.co.jp")

    val us_yahoo = factory.createLink("Yahoo!","https://www.yahoo.com")
    val jp_yahoo = factory.createLink("Yahoo!Japan","https://yahoo.co.jp")
    val excite = factory.createLink("Excite","https://excite.com")
    val google = factory.createLink("Google","https://google.com")

    val traynews = factory.createTray("新聞").apply {
        add(asashi)
        add(yomiuri)
    }

    val trayyahoo = factory.createTray("Yahoo!").apply {
        add(us_yahoo)
        add(jp_yahoo)
    }

    val traysearch = factory.createTray("サーチエンジン").apply {
        add(trayyahoo)
        add(excite)
        add(google)
    }

    val page = factory.createPage("LinkPage","結城 浩").apply {
        add(traynews)
        add(traysearch)
        output()
    }

}