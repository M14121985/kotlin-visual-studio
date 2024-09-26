fun main(){
    val mapaMutable2 = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)

    // Iterar sobre un mapa mutable
    for (elemento in mapaMutable2) {
        println(elemento)
    }  /*uno=1
         dos=2
         tres=3 */
    println()
    for(elemento in mapaMutable2){
        println("clave ${elemento.key} -> valor ${elemento.value}")
    }
    println()
    //otra forma 
    for((c, v)in mapaMutable2){
        println("clave $c -> valor $v")
    }









}