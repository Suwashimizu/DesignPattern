package bridge

/**
 * # 機能のクラス階層
 * 以下は機能を追加した場合
 *
 * サブクラスで機能を追加する
 * Something
 *   - SomethingGood
 *
 * # 実装のクラス階層
 *
 * SuperClassで抽象メソッドによってAPIを規定
 *
 * SubClassで抽象メソッドの実装を行う
 *
 * AbstractClass
 *   - ConcreteClass
 *   - AnotherConcreteClass
 */
fun main(args: Array<String>) {
    val d1: Display = Display(StringDisplayImpl("Hello, Japan."))
    val d2: Display = CountDisplay(StringDisplayImpl("Hello, World."))
    val d3: CountDisplay = CountDisplay(StringDisplayImpl("Hello, Universe."))

    d1.display()
    d2.display()
    d3.display()
    d3.multiDisplay(5)
}