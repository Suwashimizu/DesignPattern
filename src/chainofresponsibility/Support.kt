package chainofresponsibility

/**
 * Created by KEKE on 2017/12/19.
 *
 * Handler(処理者)
 *
 * GUIなどで使用される
 * androidのTouchEventなんかもそう
 */
abstract class Support(private val name: String) {
    //たらい回し先のクラス
    var next: Support? = null

    fun setNext(next: Support): Support {
        this.next = next
        return next
    }

    fun support(trouble:Trouble){
        if(resolve(trouble)){
            done(trouble)
        }else if(next != null){
            next?.support(trouble)
        }else{
            fail(trouble)
        }
    }

    abstract fun resolve(trouble: Trouble): Boolean

    //解決
    private fun done(trouble: Trouble) {
        println("$trouble is resolved by [$this].")
    }

    //未解決
    private fun fail(trouble: Trouble){
        println("$trouble cannot be resolved.")
    }

    override fun toString(): String {
        return "Support $name"
    }
}