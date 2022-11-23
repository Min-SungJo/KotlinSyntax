package ex20221118
/**
 * null값 처리
 * 1. ?
 * 2. !!
 * 3. ?:
 * **/
fun main() {
    
    //null값을 허용하는 변수 name1을 선언(String?)
    var name1: String? = null
    //null값을 허용하지 않는 변수 name2를 선언(String)
    var name2: String = "김아무개"
    
    // name1, name2의 문자열 길이(.length)를 출력해보자
    println(name1?.length)

    // ?(null값을 허용)가 붙은 변수들은 사용하려면
    // 계속해서 변수명뒤에?를 붙여줘서 관리를 해줘야 한다
    // (? : 세이프 콜) 
    println(name2.length)

    // println(name1.length)
    // Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // name1에 오류 발생
    // 원인 : null은 길이가 null이므로 NPE가 발생
    // 오류 해결 방법 : String? 형에서는 세이프콜(?.)
    // 이나 non-null 단정기호(!!.)을 사용해서 출력할 수 있다`
    // 단정기호 => null아니다 선언
    // println(name1!!.length)
    // NullPointerException

    // !!. 거의 사용하지 않는다.
    // 반드시 null값이 아니라고 판단되는 변수에만 사용가능
    // !! 사용하면, 주석을 통해 사용한 이유/경위 기록
    
    // 조건문을 활용해서 null을 혀용한 변수 검사
    // 엘비스 연산자 (Elvis) ?:


}
