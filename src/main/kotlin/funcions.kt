package org.example

fun main(){
    add()
    val result = add(2, 6)
    println(result)
}

fun add(){
    println(2+2)
}

fun add(a:Int, b:Int): Int{
    return a + b
}

fun hello():Unit{

}

/*
* fun0 - 0 parameter
* fun1 - 1 parameter
* fun2 - 2 parameters
* */