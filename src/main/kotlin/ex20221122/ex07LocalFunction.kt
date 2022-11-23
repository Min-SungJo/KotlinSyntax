package ex20221122

fun main() {
    // 지역함수
    // 사용할 때, 선언부가 있어야 한다 (선언 후 사용 가능)
    /**두 수를 합하는 지역함수*/
    fun add1(a: Int, b: Int) = a + b
    println(add1(3, 4))
    println(add2(5, 6))
}
// 최상위 레벨 함수 (Top-Level-Function)
/**두 수를 합하는 최상위 레벨 함수*/
fun add2(a: Int, b: Int) = a + b