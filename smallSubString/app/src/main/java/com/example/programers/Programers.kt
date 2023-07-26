package com.example.programers

fun main(){
    var t: List<String> = listOf("3","1","4","1","5","9","2")
    var p: List<String> = listOf("2","7","1")
    var answer: Int = 0
    var tmp: Int = 0
    var tmp2: Int = 0
    var i = 0
    var j = 0
    var k = 0
    var tmp3: Int = 0
    var tt = t.size
    var pp = p.size
    while (k < pp){
        tmp2 *= 10
        tmp2 += p[k].toInt()
        k++
    }
    while (i < tt-(pp-1)){
        tmp = 0
        j = 0
        while (j < pp){
            tmp *= 10
            tmp += t[i + j].toInt()
            j++
        }
        if (tmp < tmp2){
            answer++
        }
        i++
    }
    println(tmp)
}