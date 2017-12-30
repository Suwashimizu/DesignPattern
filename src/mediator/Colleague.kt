package mediator

/**
 * 読み:コリーグ
 * 相談役に相談する
 */
interface Colleague {
    var mediator: Mediator
    var colleagueEnabled: Boolean
}