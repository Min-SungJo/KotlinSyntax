package ex20221121
/** 산술연산자*/
fun main() {
    // 1) 산술 연산자 : + - * / %

    val num1 =30
    val num2 = 15

    // 공간만 만들어 놓을 것이라면 자료형을 꼭 명시해줘야 한다.
    var result : Int

    result = num1+num2
    println("+ : $result")
    result = num1-num2
    println("- : $result")
    result = num1*num2
    println("* : $result")
    result = num1/num2 // num2가 0이 되면 by zero Exception 이 발생한다, 0으로 나누기 불가
    println("/ : $result")
    result = num1%num2 // num2가 0이 되면 by zero Exception 이 발생한다, 0으로 나누기 불가
    println("% : $result")
}