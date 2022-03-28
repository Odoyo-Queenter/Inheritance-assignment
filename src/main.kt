fun main (){
    var mybrand = Car("volvo","sq90","grey",7)
    mybrand.carry(14)
    mybrand.identity()
    println(mybrand.calculateparkingfees(40))
   // mybrand.calculateparkingfees(40)

    var mybus = Bus ("zubaru","mq90","white",10)
    println(mybus.mixTripFare(700.50))
    println(mybus.calculateparkingfees(20))

    

}


open class Car (var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        println("carrying $people passengers")
        var x = people - capacity

        if(people <= capacity)
            println("carry $people passengers")
        else
            println("over capacity by $x people")
        
    }
    fun identity(){
        println("i am $color $make $model")
    }
    open fun calculateparkingfees(hours:Int):Int{
        var q=hours*20
        return q

    }

}
class Bus (make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){
    fun mixTripFare(fare:Double):Double{
        var z = fare*capacity
        return z

    }

    override fun calculateparkingfees(hours: Int): Int {
        var m = hours * capacity
        return m
    }

}
