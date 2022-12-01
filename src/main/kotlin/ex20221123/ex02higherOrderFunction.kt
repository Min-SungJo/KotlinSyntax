package ex20221123
/**고차함수*/
fun main() {
    // 함수의 매개변수 안에 함수를 넣고, 함수의 결과를 반환
    var retult:Int
    
    retult = sum3({x,y->x+y},10,20)
    println(retult)
}
/**람다식과 정수 2개를 매개변수로 받는 함수,
 * 정수 2개를 람다식에 적용해서 반환*/
fun sum3(sum:(Int,Int)->Int,a:Int,b:Int):Int{
    return sum(a,b)
}