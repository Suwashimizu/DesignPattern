package bridge

import java.util.*

class RandomDisplay(impl:DisplayImpl) : Display(impl) {

    /**
     * @param times 0以上times未満表示する
     */
    fun randomDisplay(times:Int){
        val randomTimes = Random().nextInt(times)
        open()
        for (i in 0 until randomTimes){
            print()
        }
        close()
    }
}