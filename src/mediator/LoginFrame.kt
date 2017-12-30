package mediator

import java.awt.Frame

class LoginFrame : Frame, Mediator {

    private lateinit var checkGuest: CollegureCheckbox
    private lateinit var checkLogin: CollegureCheckbox

    private lateinit var textUser: CollegureTextField
    private lateinit var textPass: CollegureTextField

    private lateinit var buttonOK: ColleaueButton
    private lateinit var buttonCancel: ColleaueButton

    constructor(title: String) {
        createColleague()
    }

    /**
     * 必要なColleagueを生成し保持する
     */
    override fun createColleague() {

        checkGuest = CollegureCheckbox()
        checkLogin = CollegureCheckbox()

        textUser = CollegureTextField()
        textPass = CollegureTextField()

        buttonOK = ColleaueButton()
        buttonCancel = ColleaueButton()

        //Mediatorのセット
        checkGuest.mediator = this
        checkLogin.mediator = this

        textUser.mediator = this
        textPass.mediator = this

        buttonOK.mediator = this
        buttonCancel.mediator = this

    }

    /**
     * 生成したColleagueが呼び出す
     * 処理を集結させる
     */
    override fun colleagueChanged() {
        //GUESTモード
        if (checkGuest.state) {
            textUser.colleagueEnabled = false
            textPass.colleagueEnabled = false
            buttonOK.colleagueEnabled = true
        } else {
            textUser.colleagueEnabled = true
            userpassChanged()
        }
    }

    /**
     * textUserまたはtextPassの変更があった各Colleagueの有効無効を切り替える
     */
    private fun userpassChanged() {

        //入力状態によって各パーツの有効無効を切り替える
        if (textUser.text.isNotEmpty()) {
            textPass.colleagueEnabled = true

            buttonOK.colleagueEnabled = textPass.text.isNotEmpty()
        }else{
            textPass.colleagueEnabled = false
            buttonOK.colleagueEnabled = false
        }
    }
}