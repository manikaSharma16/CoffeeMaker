package eu.tutorials.coffeemachine

data class CoffeeDetails(
    val sugarCount:Int,
    val name:String,
    val size:String,
    val creamAmount:Int
)

fun main(){
    val coffeeForDennis=CoffeeDetails(0, "Dennis", "xxl", 0)
    makeCoffeeHere(coffeeForDennis)
}

fun makeCoffeeHere(coffeeDetails: CoffeeDetails) {

    if(coffeeDetails.sugarCount==0){
        print("Coffee with no sugar for ${coffeeDetails.name}");
    }
    else if(coffeeDetails.sugarCount==1){
        println("Coffee with ${coffeeDetails.sugarCount} spoon for ${coffeeDetails.name}");
    }
    else
        println("Coffee with ${coffeeDetails.sugarCount} spoons for ${coffeeDetails.name}");
}