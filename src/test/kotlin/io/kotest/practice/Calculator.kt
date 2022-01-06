package io.kotest.practice

class Calculator {

    fun calculate(param: String): Double {

        param.filterNot { it.isWhitespace() }.ifBlank { throw IllegalArgumentException("'$param' is blank") }

        val allowedOperations = "+-*/"
        if (param.any { !it.isWhitespace() and !it.isDigit() and (allowedOperations.indexOf(it) == -1) }) {
            throw IllegalArgumentException("'$param' is not valid")
        }

        var count = 0.0
        var operationChar = ""
        param.split(" ").forEach {
            val isDigit = it.all { i -> i.isDigit() }
            if (isDigit) {
                if (count == 0.0) {
                    count = it.toDouble()
                    // continues
                } else {
                    if (operationChar.isEmpty()) {
                        throw IllegalArgumentException()
                    } else {
                        when (operationChar) {
                            "+" -> count += it.toDouble()
                            "-" -> count -= it.toDouble()
                            "*" -> count *= it.toDouble()
                            "/" -> count /= it.toDouble()
                        }
                        operationChar = ""
                    }
                }
            } else {
                operationChar = it
            }
        }

        return count
    }
}