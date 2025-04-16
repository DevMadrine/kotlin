package org.example

fun main(){
    add()
    val result = add(b=2,a= 6)// named argument
    val result1 = subtract(b=3)
    println(result)
    println(result1)
}

fun add(){
    println(2+2)
}

fun add(a:Int, b:Int): Int{
    return a + b
}

fun subtract(a:Int = 10, b:Int) = a - b;//default argument

fun hello():Unit{

}

/*
* fun0 - 0 parameter
* fun1 - 1 parameter
* fun2 - 2 parameters
* */