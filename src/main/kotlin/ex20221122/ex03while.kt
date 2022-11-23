package ex20221122

import java.lang.NumberFormatException

/**while문*/
fun main() {
    
    // while(조건식){
    // 조건식이 true 일 동안, 실행시킬 코드
    // }
    // 단, 조건식은 무조건 결과값으로 true/false 를 돌려줘야 함
    print("숫자를 입력하세요 : ")


    /**입력한 숫자*/
    var answer = readLine()?.toInt()
    /**결과값을 누적시키는 변수*/
    var factorial = 1
    while (true) {
        if (answer==null||answer==1) break
        factorial *= answer
        answer--
    }
    println("결과값 : $factorial")

}