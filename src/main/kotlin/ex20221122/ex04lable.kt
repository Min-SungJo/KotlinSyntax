package ex20221122

/**label*/
fun main() {

    // label : while 문에 이름을(label)을 부여해서 (사용자가 원하는 이름으로)
    // break||continue 할 때 특정 while 문을 지정할 수 있다

    outer@while (true){
        println("바깥 while 문 작동중")
        inner@while (true){
            println("안 while 문 작동중")
            // @outer 로 바깥 while 문까지 종료
            break@outer
        }
    }
}