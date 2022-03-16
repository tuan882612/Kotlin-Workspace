
fun vowel(string: String): String{
    var hash = mutableMapOf(
        'a' to 0,
        'e' to 0,
        'i' to 0,
        'o' to 0,
        'u' to 0
    )
    var res = mutableListOf<Char>()

    string.forEach {
        if (it in hash) {
            hash[it] = hash[it]!! + 1
        }
    }
    for((i, v) in hash){
        if(v > 0){
            res.add(i)
        }
    }

    return res.joinToString(", ")
}

fun main(args: Array<String>) {
    val string = listOf("hello", "racecar", "apple", "gmg", "wowzers")
    string.forEach {
        val temp = vowel(it)
        if(temp.isNotEmpty()){
            println("The vowels that were used for $it is: $temp")
        }
        else {
            println("No vowels were use for $it")
        }
    }
}
