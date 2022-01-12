import kotlinx.coroutines.*

//suspend fun main()
//{
//    for(i in 0..5){
//        delay(400L)
//        println(i)
//    }
//
//    println("Hello Coroutines")
//}


//suspend fun main() = coroutineScope {
//    launch {
//        for(i in 0..5){
//            delay(400L)
//            println(i)
//        }
//    }
//    println("Hello Coroutines")
//}

suspend fun main()= coroutineScope{
    launch{ doWork() }

    println("Hello Coroutines")
}
suspend fun doWork(){
    for(i in 0..5){
        println(i)
        delay(400L)
    }
}

//suspend fun main()= coroutineScope{
//
//    launch{
//        for(i in 0..5){
//            delay(400L)
//            println(i)
//        }
//    }
//    launch{
//        for(i in 6..10){
//            delay(400L)
//            println(i)
//        }
//    }
//
//    println("Hello Coroutines")
//}

//suspend fun main() = coroutineScope{
//
//    launch{
//        delay(400L)
//        println("Outer coroutine")
//        launch{
//            //delay(400L)
//            println("Inner coroutine")
//        }
//    }
//
//    println("End of Main")
//}

//suspend fun main() = coroutineScope{
//
//    val job:Job= launch{
//        for(i in 1..5){
//            println(i)
//            delay(400L)
//        }
//    }
//
//    println("Start")
//    println(job.join())
//    println("End")
//}

//suspend fun main()= coroutineScope {
//    val job = launch(start = CoroutineStart.LAZY) {
//        println(1)
//        delay(1000)
//        println("Courutina has started")
//    }
//
//    delay(1000)
//    job.start()
//    println("Other method")
//}