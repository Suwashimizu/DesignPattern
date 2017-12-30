package abstractfactory.factory

abstract class Factory {
    companion object {
        /**
         *
         * リフレクションでクラスを生成
         * @return 抽象クラスを返す
         */
        fun getFactory(className:String):Factory {
            var factory : Factory? = null

            try {
                return Class.forName(className).newInstance() as Factory
            }catch (e:Exception){
                e.printStackTrace()

                throw e
            }
        }
    }

    abstract fun createLink(caption:String,url:String):Link
    abstract fun createTray(caption:String):Tray
    abstract fun createPage(title:String,author:String):Page
}