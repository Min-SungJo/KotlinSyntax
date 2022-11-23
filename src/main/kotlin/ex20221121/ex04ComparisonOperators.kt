package ex20221121

/**비교연산자*/
fun main() {

    val a: Int = 128
    val b = a
    /** === : 참조값 비교*/
    println(a === b) // true
    println(a == b) // true
    // 기본자료형은 static 에 저장이 된다.
    // 그렇다면 참조형 자료를 비교하는 === 은 어떻게 동작을 하는가?
    // 값만을 비교하게 된다. 따라서 기본 자료형을 비교할 때에는 == 와 같은 수행을 한다

    /**128이라는 기본자료형 값을 가진 참조형자료*/
    val c: Int? = a
    /**128이라는 기본자료형 값을 가진 참조형자료*/
    val d: Int? = a
    /**참조형자료 c와 같은 참조형자료*/
    val e: Int? = c
    println(c == d) // true
    println(c === d) // false
    println(c === e)  // true

}