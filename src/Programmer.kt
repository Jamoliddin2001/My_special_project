class Programmer(name:String, age:Int,var language:String) : Worker(name,age) {
    override fun work() {
        println("I am $language developer")
    }
}