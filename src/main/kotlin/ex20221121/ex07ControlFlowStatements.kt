package ex20221121
/**제어문*/
fun main() {

    // 단순 if 문 (만약에 ~하면 ~한다)
    /**성별이 담겨있는 변수*/
    val gender = "남"
    if (gender == "여") println("여자입니다.")
    // var result2 = if(gender == "여") "여자입니다." 남자일 경우 null 오류 발생

    // if(조건식) else
    if (gender == "여") println("여자입니다.")
    else println("남자입니다.")

    val result = if (gender == "여") "여자입니다." else "남자입니다."
    println(result)
    
}