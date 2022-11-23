package ex20221122
/***/
fun main() {

    //Any
    // 모든 자료형이 될 수 있다
    /**모든 자료형을 담을 수 있는 변수*/
    var str1: Any = "abc"
    str1 = 123
    str1 = 'c'
    // println(str1)

    // is Int -> 정수형 자료형이 맞는지 타입 체크
    // data type 을 체크 해주는 키워드
    
    //Person p1 = new Person
    //p1
    //is Person
    //상속관계에서, 어디에서 나온 필드/메서드(프로퍼티)인지 확인하기위해 is 사용
    
    when(str1){
        is Int -> println("This is Int")
        is String -> println("This is String")
        is Char -> println("This is Char")
        else -> println("is not Int, String")
    }

}