/*fun main() {

    displayMessage(::morning)
    displayMessage(::evening)
}

fun displayMessage(mes: () -> Unit){
    mes()
}

fun morning(){
    println("Good Morning")
}
fun evening(){
    println("Good Evening")
}*/
fun main() {

    action(5, 3, ::sum)
    action(5, 3, ::multiply)
    action(5, 3, ::subtract)
    action(5, 2, ::divade)
}

fun action (n1: Int, n2: Int, op: (Int, Int)-> Double){
    val result = op(n1, n2)
    println(result)
}
fun sum(a: Int, b: Int): Double{
    return a.toDouble() + b
}
fun subtract(a: Int, b: Int): Double{
    return a.toDouble() - b
}
fun multiply(a: Int, b: Int): Double{
    return a.toDouble() * b
}

fun divade(a:Int,b:Int):Double{
    return a.toDouble()/b
}