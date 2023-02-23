fun main() {
    fruits()
    key()
    value()
    end("Liz", "Foi", "Fiddel")

}
fun fruits(){
    var words = arrayOf("Melon", "Apples", "Grapes", "Mango")
    println(words.contentToString())

}
fun key(){
    var cities = arrayOf("harare","mumbai", "dodoma", "jakarta")
   var lock = println(cities.map { it.capitalize() })
}
fun value(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers.get(1) + numbers.get(4))
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}
fun end(name1:String, name2:String, name3:String):Array<String>{
    var list = arrayOf(name1,name2,name3)
    return (list)


}

