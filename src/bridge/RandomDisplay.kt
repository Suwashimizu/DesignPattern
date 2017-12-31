package bridge

import java.util.*

class RandomDisplay(impl:DisplayImpl) : CountDisplay(impl) {

    /**
     * @param times 0以上times未満表示する
     */
    fun randomDisplay(times:Int){
        val randomTimes = Random().nextInt(times)

        multiDisplay(randomTimes)
    }
}