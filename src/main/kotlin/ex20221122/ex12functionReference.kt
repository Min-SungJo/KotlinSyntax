package ex20221122

/**날씨 호출 함수*/
fun todayWeather() {
    println("오늘 날씨는 비 ")
}

//함수를 호출해서 변수에 대입
// ::함수 이름 ---> Android intent 에서 자주 사용
val weather = ::todayWeather

/**함수 참조*/
fun main() {
    // 함수를 참조해서 변수처럼 사용
    // 함수 참조를 통해서 변수처럼 사용하고 싶으면
    // 변수명 뒤에 .call() 을 붙여준다
    // weather.call() 1.1v
    weather()
}