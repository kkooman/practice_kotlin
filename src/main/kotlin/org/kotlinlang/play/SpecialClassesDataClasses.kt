package org.kotlinlang.play

fun main(args: Array<String>) {

    val user = User("Alex", 1)
    // toString is auto-generated
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // all their properties are equal
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // Auto-generated hashCode value
    println(user.hashCode())
    println(secondUser.hashCode())

    // copy() function
    // Auto-generated copy
    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 2))

    // Auto-generated componentN
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}

// getter/setter을 자동으로 작성
// componentN 함수를 작성해준다.
// copy 객체를 복사할 때 일부 값을 변경하고 싶을 때 사용
// toString, hashCode, equals 자동 오버라이딩
/*
toSting는 "클래스명(변수명=변수값, 변수명=변수값)"으로 작성해준다.
hashCode는 "변수값 혹은 변수의 해시코드 * 31+(인자 개수)"로 작성된다.
만약 변수에 null이 들어가면 삼항 연산자를 이용해 해시코드가 아닌 0으로 삽입되어서 연산된다.
equals 는 객체 내의 변수 값들을 비교하는 것으로 오버라이딩 된다.
 */
data class User(val name: String, val id: Int)