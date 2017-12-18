package chainofresponsibility

/**
 * Created by KEKE on 2017/12/19.
 * @param number この番号だけ解決できる
 */
class SpecialSupport(name:String,val number:Int) : Support(name) {

    override fun resolve(trouble: Trouble): Boolean {
        return trouble.number == number
    }

}