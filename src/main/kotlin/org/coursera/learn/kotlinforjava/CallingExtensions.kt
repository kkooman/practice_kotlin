package org.coursera.learn.kotlinforjava

open class Parent
class Child : Parent()

fun Parent.foo() = "parent";
fun Child.foo() = "child";
fun String.get(index: Int) = '*'

fun main() {
    val parent: Parent = Child()
    println(parent.foo())    // parent

    println("abc".get(1))
}

//the analogous code in java
//public static String foo(Parent parent) {return "parent";}
//public static String foo(Child child) {return "child";}

//--------------------------------------
// extension 은 static 메소드 처럼 동작한다.
// override가 아니다.
