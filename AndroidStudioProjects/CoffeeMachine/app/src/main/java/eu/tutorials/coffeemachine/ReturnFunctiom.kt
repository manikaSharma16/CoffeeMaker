package eu.tutorials.coffeemachine

fun main(){
    println("Enter number 1")
    var num1= readln().toInt()
    println("Enter number 2")
    var num2= readln().toInt()
    var resultAdd=add(num1,num2)
    println("The result is $resultAdd")
    var resultDivide=divide(num1,num2)
    println("The result is $resultDivide")
}

fun add(a:Int, b:Int): Int{
    return a+b
}

fun divide(a:Int, b:Int): Double{
    return a.toDouble()/b.toDouble()
}