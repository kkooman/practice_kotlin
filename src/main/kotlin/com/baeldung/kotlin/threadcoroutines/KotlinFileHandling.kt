package com.baeldung.kotlin.threadcoroutines

import java.net.URL


fun main() {
    val date = "20221208.json"
    val sourceUrl = URL("http://localhost:8000/$date")
    val connection = sourceUrl.openConnection()


   // val objectMapper: ObjectMapper
    
    
    
    /*
    val reader = connection.getInputStream().bufferedReader()
    val keywords = mutableListOf<KeywordRanking>()

    reader.useLines { lines ->
        lines.drop(1).forEach {
            it.split(",").run {
                keywords.add(
                    KeywordRanking(
                        date,
                        this[0].toInt(),
                        this[1],
                        this[2].toInt(),
                        this[3],
                        this[4].toInt(),
                        this[5],
                        this[6].toInt(),
                        this[7].toFloat(),
                        null
                    )
                )
            }
        }
    }

    println(keywords)*/
}

data class KeywordRanking(
    val stampDate: String,
    val ranking: Int,

    val popularKeyword: String,
    val popularCount: Int,

    val boostKeyword: String,
    val boostCount: Int,

    val purchasedKeyword: String,
    val purchasedCount: Int,
    val purchasedRate: Float,

    val createdDate: String?
)