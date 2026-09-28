fun divide(dividende: Int, diviseur: Int): Int {
    return try {
        dividende / diviseur
    } catch (e: ArithmeticException) {
        println("Erreur : division par zéro impossible.")
        0
    }
}

fun main() {

    println("Résultat : ${divide(20, 5)}")

    println("Résultat : ${divide(20, 0)}")
}