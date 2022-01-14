package org.kotlinlang.play

class Properties {
    var setterVisibility: String = "abc"
        private set // the setter is private and has the default implementation

    var setterWithAnnotation: Any? = null
        // @Inject set // annotate the setter with Inject, error
}


fun main() {

    var pp = Properties()
    println(pp.setterVisibility)
    // pp.setterVisibility = "ddd" // error

}