fun main(){
    val nomebre = listOf(1,2,3,4,5)
    val pairs = nomebre.filter{ it %2 == 0 }
    println("le nomebre est paire $pairs")
    val inpaire = nomebre.filter{ it % 2 != 0 }
    println("le inpaire $inpaire")
    val supreure = nomebre.filter { it > 10 }
    println("le supreure $supreure")

}