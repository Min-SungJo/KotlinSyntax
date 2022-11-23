package ex20221122
/**함수 생략*/
fun main() {

    getName("김아무개")
    println(getName("김아무개"))
    getAge(25)
    println(getAge(25))
}

/**호출 시 내 이름의 결과 값만 가져오는 함수*/
fun getName(name: String): String {
    return name
}

// 코틀린은 자료형을 추론할 수 있다 --> 생략 가능
// 중괄호 {} 안의 코드가 한줄이면, 중괄호와 return 키워드 생략 가능
// 대신 대입연산자 = 사용
// 반환하고 있는 데이터를 토대로 리턴 타입도 추론
/**호출 시 내 나이의 결과 값만 가져오는 함수*/
fun getAge(age: Int) = age