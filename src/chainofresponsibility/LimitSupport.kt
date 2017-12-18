package chainofresponsibility

/**
 * Created by KEKE on 2017/12/19.
 *
 * @param limit この番号未満なら解決できる
 */
class LimitSupport(name:String,private val limit:Int) : Support(name) {

    override fun resolve(trouble: Trouble): Boolean {
        return trouble.number < limit
    }
}