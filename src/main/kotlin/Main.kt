fun main() {
    println(evenStrings(mutableListOf("Magic","Aly","June","Panda","Chena","Zulfa")))
    println(heightsCalculated(listOf(55.0,20.0,23.0,22.0,65.0,55.0)))
    personDetails()
    println(car())
    println(sortedByAge(mutableListOf()))


}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun evenStrings(evenList:List<String>):List<String>{
    val stringIndex= mutableListOf<String>()
    for (x in 0 until evenList.size step 2 ){
        stringIndex.add(evenList[x])

    }
    return stringIndex
}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
class AverageHeight(var avg:Double, var plus:Double)
fun heightsCalculated(heights:List<Double>):List<Double>{
    val totalHeight=heights.sum()
    var average= totalHeight/heights.size
    var both= listOf(totalHeight,average)
    return both
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(val name:String, val age:Int,val height:Int,val weight:Double)
    fun personDetails(){
        val person1 = Person("Marina", 23, 50, 54.5)
        val person2 = Person("Bobby", 32, 65, 55.7)
        val person3 = Person("Krish", 27, 53, 50.0)
        val persons = listOf(person1, person2, person3)
        val sortedPersonlist=persons.sortedByDescending{person ->person.age }
        println(sortedPersonlist)
    }
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun sortedByAge(people: MutableList<Person>): List<Person> {
    people.addAll(listOf(
        Person("Appa", 25, 100, 70.0),
        Person("Milly ", 30, 165, 60.0)
    ))
    return people.sortedByDescending { it.age }
}





//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
class Vehicle(var registration:String, var mileage: Double)
fun car():Double{
    val car1=Vehicle("KDE245",8.0)
    val car2=Vehicle("DGE4563",8.0)
    val car3=Vehicle("KPZ4537",5.0)
    val cars= listOf(car1, car2, car3)
    var all=listOf(car1, car2, car3)
    var sumMileage=all.sumOf { miles->miles.mileage }
    var avgMileage=sumMileage/3
    return avgMileage
}