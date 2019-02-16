package com.example.toboc.icnb.model

//object JokesPoKo{
//    data class id(val id: Int)
//    data class joke(val joke: String)
//    data class categories(val category: List<String>)
//}
object JokesPoKo{
    data class Value(var jokes: List<Jokes>)
    data class Jokes(var id: Int, var joke: String, var categories: List<String>)
}