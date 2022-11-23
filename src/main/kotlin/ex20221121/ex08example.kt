package ex20221121

//import java.util.Scanner
import java.lang.NumberFormatException
import kotlin.random.Random

/**예제*/
fun main() {
    ///**java Scanner*/
    //val sc = Scanner(System.`in`)
    /**kotlin Random*/
    val rd = Random
    /**1~10사이의 랜덤수1*/
    var num1 = rd.nextInt(10)+1
    /**1~10사이의 랜덤수2*/
    var num2 = (1..10).random()
    println("$num1 + $num2 = ?")
    print("Enter the Answer : ")
    ///**사용자가 입력한 값*/
    //val inputNum = sc.nextInt()
    
    
    ///**사용자가 입력한 값*/
    //val answer = readLine()?.toInt() ?: -1
    try {
        val answer = readLine()?.toInt()
        /**일치여부*/
        val result = if (num1+num2 == answer) "정답입니다" else "오답입니다"
        print("결과 : $result")
    }
    catch (e: NumberFormatException){
        println("숫자를 입력해주세요")

    }
    // readLine 을 사용하게 되면 사용자는 아무 문자/숫자가 입력 가능
    // toInt ---> "1234"사용자가 무조건 숫자를 입력해야 형변환이 가능

    
    // Exception 잡는 방법
    // try catch ---> 예외상황
}