package ex20221118

fun main() {
    //IntelliJ에서 실행시킬 코드는 main함수 안에 작성
    println("Hello~ Full Stack")
    // 실행 단축키 : shift F10 => Run창에 출력

     // 변수 (Variable)
     // 사전적 의미 : 변하는 수, 변할 수 있는 수
     // 프로그래밍 : 값(data)를 저장할 수 있는 공간

     // 1. 변수 선언하는 방법
     // 1) 상수인지, 변수인지 결정
     // val(상수: value), var(변수: variable)
     // val/var 변수명 : 자료형 = 데이터 값

    
    /**
     * 나이(int)자료형을 담는 변수
     * **/
    var age: Int =20
    
    /**이름(String)자료형을 담는 변수**/
    var name : String = "김아무개"

    // 코틀린이 자료형을 추론하여 변수의 자료형을 생략 가능
    var num = 2022
    // 자료형 확인 단축키 : ctrl shift p
    // 데이터를 토대로 자료형을 추론
    // * 자료형을 생략할 수 없는 경우 *
    // 값이 할당(초기화)되어 있지 않으면 자료형을 생략할 수 없다

    var str : String
    str = "문자열"

    // 2. 상수 선언하는 방법
    val empno = "20221118"
}
