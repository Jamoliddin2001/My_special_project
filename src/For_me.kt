fun main(){
    //println("Jamoliddin")
    //println((1..3).toList())
    val workers= mutableListOf<Worker>()
    workers.add(Programmer("Jamoliddin",20,"Java and Kotlin"))
    workers.add(Programmer("Firdavs",19,"Java, Kotlin and Python"))
    workers.add(Programmer("Sunat",20,"Java and PHP"))
    workers.add(Programmer("Behzod",21,"C++ and PHP"))
    workers.add(Teacher("Husniddin",20,"Informatic"))
    workers.add(Teacher("Hikmatullo",26,"Mathematic"))

    for (worker in workers) {
        worker.name()
        worker.work()
    }
}