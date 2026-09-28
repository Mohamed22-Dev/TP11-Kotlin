fun main(){
    val paire = fun(nombre:Int): Boolean{
        return 2 % nombre == 0
    }
    val nombres = listOf(1, 2, 3, 4, 5, 6)
    for (n in nombres){
        if (paire(n)) {
         println("nombre est paire")}
        else{
            println("nombre est inpaire")
        }
    }
}