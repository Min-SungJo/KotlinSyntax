package ex20221121

fun main() {
    //when문 : java에서 switch문과 동일
    //when (변수){
    // 값1 -> 실행코드1
    // 값2 -> 실행코드2
    // ..
    // else -> 실행코드 n
    // }
    val a = 2
    when(a){
        // 여러 값의 실행 코드가 같을 경우
        // a가 1또는 2일 경우 -> 실행 코드를 실행
        1,2-> println("a는 1또는 2입니다.")
        //2-> println("a는 2입니다.")
        else -> println("a는 1,2가 아닙니다.")
    }
    // 식을 넣는다면, 출력될 수 있는 값이 있는 식으로
    when(a%2){
        1-> println("홀수입니다.")
        0-> println("짝수입니다.")
        else -> println("")
    }
    //in .. (범위를 설정하는 키워드)
    when(a){
        in 0..10-> println("1이상 10이하 입니다.")
        in 11..20-> println("11이상 20이하 입니다.")
        else -> println(a)
    }
    
    // 객체/변수의 데이터 타입을 확인할 때 가장 많이 사용
    // is, Any, when
    // is : 데이터 타입 확인 사용하는 키워드
    // Any : Java Object(최상위 클래스)와 유사
    // when : 조건식의 일종

    // 반복문
    // **함수
    // + 람다식
}