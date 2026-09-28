fun main() {

    val nombres = listOf(10, 20, 30, 40, 50, 60)

    val somme = fun(): Int {
        var total = 0
        for (nombre in nombres) {
            total += nombre
        }
        return total
    }
    println("La somme est : ${somme()}")
}
