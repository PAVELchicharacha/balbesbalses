import kotlin.random.Random


fun main(args:Array<String>) {

    var rand= Random
    var mas5=Array(30) { rand.nextInt(1, 150) }
    var s =0
    for (i in mas5) {
        print(i.toString()+" ")
        s += i
    }
    println()
    println(s)
}






