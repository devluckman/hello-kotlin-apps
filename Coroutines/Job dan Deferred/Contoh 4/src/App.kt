import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("time is up!"))
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled ${job.getCancellationException().message}")
    }
}