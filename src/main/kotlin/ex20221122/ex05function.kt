package ex20221122

/**함수 생성*/
fun main() {
    val result = sum(5, 6)
    println("결과 값 : $result")
    sumPrint(5, 6)
    // void ---> Unit
    // void, Unit 함수가 '기능'을 가지고 경우가 많다
}

fun sumPrint(num1: Int, num2: Int){
    val sum = num1 + num2
    println("Unit 예시 : $sum")
}

// main 밖
fun sum(num1: Int, num2: Int): Int {
    // fun +함수명(호출명) + (매개변수) : 리턴타입
    // 단, 리턴타입에 자료형이 명시되어 있으면 return 필수
    return num1 + num2
}

