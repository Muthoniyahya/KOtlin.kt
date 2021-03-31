open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun Carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Over capacity by$people passenger")
        } else {
            println("Over capacity by $x people")
        }
    }

fun identity(){
    println("I am $color $make $model")

    }
    open fun calculateParkingFees(hours:Int):Int{
        var parkingFees=hours*10
        return parkingFees}
    }
    class Bus(make:String,model: String,color: String,capacity: Int):Car(make,model,color, capacity){
        fun maxTripFare(fare:Double):Double{
            var maxfare=0
            return maxfare+fare
        }
          fun calculatePackingFees(hours:Int):Int{
             return hours*capacity
         }
    }


fun main() {
    var car = Car("Toyota", "Harrier", "white", 3)
    car.Carry(5)
    car.Carry(13)
    car.identity()
    var bas =Bus("Toyota","mini bus","Black",24)
    println(bas.maxTripFare(5.0))
    println(bas.calculatePackingFees(7))
}







