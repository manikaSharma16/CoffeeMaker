package eu.tutorials.coffeemachine

fun main(){
    println("Who is this coffee for?")
    var name= readln()
    println("How many pieces of sugar do you want?")
    var sugarCount= readln().toInt()
    makeCoffee(sugarCount, name);
}

fun makeCoffee(sugarCount: Int, name: String) {

    if(sugarCount==0){
        print("Coffee with no sugar for $name");
    }
    else if(sugarCount==1){
        println("Coffee with $sugarCount spoon for $name");
    }
    else
        println("Coffee with $sugarCount spoons for $name");
}