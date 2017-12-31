package bridge

/**
 * 機能のクラス
 *
 * 指定回数だけ表示するという機能を追加したクラス
 */
class CountDisplay(impl:DisplayImpl) : Display(impl){

    fun multiDisplay(times:Int){
        open()
        for (i in 0 until times){
            print()
        }
        close()
    }
}