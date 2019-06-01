import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    val list = listOf("hoge", "foo", "bar", "piyo")
    list.forEachIndexed { index, s ->
        awaitAll( async {
            println(s) }
        )
    }

    val stringLengths = async {
        list.map {
            awaitAll(async { it.length })
        }
    }
}

fun printHogeFooBar(hoge: String, foo: String, bar: String) {
    println("$hoge, $foo, $bar")
}

