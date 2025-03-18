package eu.tutorials.coffeemachine

fun main(){
    makeCoffee(2, "Jimmy");
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