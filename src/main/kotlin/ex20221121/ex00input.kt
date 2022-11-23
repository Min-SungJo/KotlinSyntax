package ex20221121

import java.util.Scanner

fun main() {

    // 입력하는 도구를 가져오는 방법
    // Scanner sc = new Scanner(System.in)
    val sc = Scanner(System.`in`)
    // java : .in console 창으로 입력될 무언가가 있다
    //.`in` --> Run 창으로 입력될 무언가가 있다.

    // readLine() 사용해서 런 창에 입력할 수 있다.
    println("readLine()을 사용한 입력 >> ")
    var num1 =  readLine()?.toInt()
    println("readLine()을 반드시 입력해야합니다 >> ")
    var num2 =  readLine()!!.toInt()
    // readeLine()은 무조건 String?타입으로 리턴

    // 1. null 이 발생할 수 있는 상황에 대해서 조건식 부여
    if (num1 != null) {
        print(num1+2)
    }
    // 2. Elvis 연산자
    //print(num1?.plus(2) ?: 실행코드, 데이터 값)

    // 3. !! 사용, 최대한 꺼려야 한다.
    // print(num1!! +2)
    // ?
}