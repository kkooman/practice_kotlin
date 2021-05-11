package org.kotlinlang.play

fun main(args: Array<String>) {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Ethan", "Developer")))
    //println(greetMammal(Android("NAVER CLOVA", "AI")))
}

// Sealed class는 Super class를 상속받는 Child 클래스의 종류 제한하는 특성을 갖고 있는 클래스
// 장점 중 하나는 when을 사용할 때 else를 사용하지 않는 것
// Sealed class는 abstract 클래스로, 객체로 생성할 수 없습니다.
// Sealed class의 생성자는 private입니다. public으로 설정할 수 없습니다.
// Sealed class와 그 하위 클래스는 동일한 파일에 정의되어야 합니다. 서로 다른 파일에서 정의할 수 없습니다.
// 하위 클래스는 class, data class, object class으로 정의할 수 있습니다.
sealed class Mammal(val name: String)

// all subclasses must be in the same file.
class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)
// 'return' expression required in a function with a block body ('{...}')
// class Android(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}
