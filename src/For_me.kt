fun main(){
    println("Jamoliddin")
    println((1..3).toList())
    val workers= mutableListOf<Worker>()
    workers.add(Programmer("Jamoliddin",20,"Java and Kotlin"))
    //workers.add(Programmer("Firdavs",19,"Java, Kotlin and Python"))
    workers.add(Programmer("Sunat",20,"Java and PHP"))
    workers.add(Programmer("Dovar",20,"JavaScript and Go"))
    workers.add(Programmer("Behzod",21,"C++ and PHP"))
    workers.add(Programmer("Husniddin",20,"C++, Java, Python, Tajik"))
    workers.add(Teacher("Hikmatullo",26,"Mathematic"))
    workers.add(Programmer("Nassim",20,"JavaScript and C++"))
    workers.add(Teacher("Doston",22,"Khimik"))  

    println((Math.random()*10).toString())

    for (worker in workers) {
        worker.name()
        worker.work()
    }
}