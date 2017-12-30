package factorymethod.framework

/**
 * frameworkはIdCardに依存しないこと
 */
abstract class  Factory {

    /**
     * Productの作成と登録を行う
     */
    fun create(owner:String):Product {
        return  createProduct(owner).apply {
            registerProduct(this)
        }
    }

    /**
     * 製品の作成
     */
    protected abstract fun createProduct(owner:String) : Product

    /**
     * 製品の登録
     */
    protected abstract fun registerProduct(product: Product)
}