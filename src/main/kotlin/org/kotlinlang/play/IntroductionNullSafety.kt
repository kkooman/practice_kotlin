package org.kotlinlang.play

fun main(args: Array<String>) {
    var neverNull: String = "This can't be null"
    // Null can not be a value of a non-null type String
    // neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    // Null can not be a value of a non-null type String
    // inferredNonNull = null

    strLength(neverNull)
    /*
        Type mismatch.
        Required: String
        Found: Nothing?
    */
    // strLength(nullable)


    println(describeString("A"))
    println(describeString(null))
}

fun strLength(notNull: String): Int {
    return notNull.length
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}