fun calculate(a : Int , b : Int, operation: (Int,Int) -> Int) : Int{
    return operation(a, b)
}
fun main() {
    val addition = calculate(2, 4, { a, b -> a + b })
    println(addition)
    val soustraire = calculate(5,6, {a, b -> a - b })
    println(soustraire)
    var multiplier = calculate(5, 4, { a, b -> a * b })
    println(multiplier)
}