package eu.tutorials.coffeemachine

fun main(){
    makeCoffee(2);
}

fun makeCoffee(sugarCount: Int) {

    if(sugarCount==0){
        print("Coffee with no sugar");
    }
    else if(sugarCount==1){
        println("Coffee with $sugarCount spoon");
    }
    else
        println("Coffee with $sugarCount spoons");
}