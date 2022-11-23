package ex20221122
/**매개변수*/
fun main() {

    // addList 를 호출할 때마다 Email 이 비어있을 경우 "default" 값을
    // 함수 전달인자로 넘겨주는 일이 매우 번거로움
    // 함수 선언하는 부분에서 매개변수의 기본값을 설정할 수 있다
    // (받아오는 인자가 없을 경우에 대해서)
    // ex) 회원가입 => (firebase 에서 사용할 예정)
    addList("김아무개","email@address")
    addList("김아무개")
}

// 1. 회원의 이름과 이메일 주소 저장
// 이메일을 입력하지 않았을 경우, "default" 저장
/**이름과 이메일(null->default)을 설정하는 함수*/
fun addList(Name:String,Email:String="default"){
    // db 저장 코드
}