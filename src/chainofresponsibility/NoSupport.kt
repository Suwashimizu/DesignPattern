package chainofresponsibility

/**
 * Created by KEKE on 2017/12/19.
 */
class NoSupport(name:String) : Support(name) {

    override fun resolve(trouble: Trouble): Boolean {
        return false
    }
}