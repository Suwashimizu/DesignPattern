package factorymethod.idcard

import factorymethod.framework.Factory
import factorymethod.framework.Product

class IDCardFactory : Factory(){

    val owners : MutableList<Product> = mutableListOf()

    /**
     * IDCardのインスタンスを作成する
     */
    override fun createProduct(owner: String): Product =
            IDCard(owner)

    /**
     * IDCardのownerをownersに追加する
     */
    override fun registerProduct(product: Product) {
        owners.add(product)
    }
}