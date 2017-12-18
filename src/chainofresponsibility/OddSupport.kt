package chainofresponsibility

/**
 * Created by KEKE on 2017/12/19.
 * 奇数番号のトラブルを処理する
 */
class OddSupport(name: String) : Support(name) {

    override fun resolve(trouble: Trouble): Boolean {
        return trouble.number % 2 == 1
    }
}