package org.example

fun main (){

    ageRestriction(18)
    checkNumberSign(9)
}

fun ageRestriction(age: Int){

    if(age < 18) println("Access denied")
    if (age > 18 || age ==18) println("Access approved")

}

fun checkNumberSign(number: Int): String{
    return if (number > 0){
        "positive"
    }else if (number < 0){
        "negative"
    }else{
        "zero"
    }
}