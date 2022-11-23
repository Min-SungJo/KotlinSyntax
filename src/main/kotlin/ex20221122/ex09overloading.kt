package ex20221122

/**오버로딩*/
fun main() {
    // 오버로딩(OverLoading) : 중복정의
    // 한 클래스 내에서 같은 이름의 메소들르 선언
    // 단, 매개변수의 형태가 달라야 한다
    // 생성자, println 문

    // setName()
    // 미국인 (firstName, middleName, LastName)
    // 한국인 (firstName, LastName)
    setName("스티븐","폴","잡스")
    setName("김","아무개")
}

/**미국인 이름 등록*/
fun setName(firstName: String, middleName: String, LastName: String) {

}

/**한국인 이름 등록*/
fun setName(firstName: String, LastName: String) {

}