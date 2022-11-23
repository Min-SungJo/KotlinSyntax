package ex20221121
/**앨비스연산자*/
fun main() {

    // 앨비스 연산자 ( ?: )
    // NPE 발생을 예뱡할 수 있도록 NULL 값을 처리 해주는 연산자

    /**null이 담긴 변수*/
    var str:String? = null
    //print(str?.length ?: null일 결우 출력하고 싶은 값)
    println(str?.length ?: "null 입니다")

    /**str 의 길이, null 이면 -1, 서버에서 값을 받아올 때 사용*/
    var result = str?.length ?: -1
    println(result)
}
