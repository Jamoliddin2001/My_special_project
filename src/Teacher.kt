class Teacher(name:String,age:Int,var predmet:String) : Worker(name,age) {
    override fun work() {
        println("I am $predmet teacher")
    }
    override fun name() {
        println("My name $name")
    }
}