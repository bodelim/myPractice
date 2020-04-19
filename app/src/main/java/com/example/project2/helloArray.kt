package com.example.project2

fun main() {
    //배열
    var arr = listOf("1","2")//수정 불가능
    var arr2 = mutableListOf("1","2")//수정 쌉가능

    //반복문
    for(item in arr2) {
        println(item)
    }

    //인덱스 얻는 반복문
    for((index, item) in arr2.withIndex()) {
        println("$index, $item")
}

//casting object
var hello: Any = "hello"
if(hello is String) {
    var str: String = hello
    println(str)
}
}