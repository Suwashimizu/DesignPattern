package chainofresponsibility

/**
 * Created by KEKE on 2017/12/19.
 */
fun main(args : Array<String>) {
    val alice = NoSupport("alice")
    val bob = LimitSupport("bob",100)
    val charlie = SpecialSupport("Charlie",429)
    val diana = LimitSupport("diana",200)
    val elmo = OddSupport("Elmo")
    val fred = LimitSupport("fred",300)

    alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred)

    for(i in 0..500 step 33){
        alice.support(Trouble(i))
    }
}