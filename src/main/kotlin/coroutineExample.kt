import kotlinx.coroutines.*

suspend fun main() {

    var job: CoroutineScope = CoroutineScope(Dispatchers.Main + Job())

    GlobalScope.launch {
        fetchInBackground()
    }

 }





suspend fun fetchInBackground() {

    withContext(Dispatchers.IO) {

        for (i in 0..20) {
            println(i)
        }
    }


}