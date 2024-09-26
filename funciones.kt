fun main(){
println(sumarNumeros3(listOf(45,78,45,45,45,789,123)))

println(numerosPares)
println(numerosPares2)
println(palabrasFiltrada)
println(filtradoNumerosMayores)
println(resultado)

//recorremos la lista de productos con forEachIndexed
listaProductos.forEachIndexed{i,j->println("indice numero $i->producto $j")}


//asignamos la lista a una variable con map
val ListaPreciosProductos=listaProductos.map{it}
//val ListaPreciosProductos=listaProductos.map{i->i} lo mismo pero con ->

for (i in listaProductos.indices){
    println(" $i-> ${listaProductos[i]}")
}


//con for tradicional 
for(i in palabras.indices){
    println(" con for tradicional->>>indice $i, ${palabras[i]}")
}


for (usuario in usuarios) {
    println("${usuario.nombre} ${usuario.edad}")
}



println(sumarNumeros4(456, 789, 10000, 564, 7))




val luxuryCars = mapOf(
    "Rolls-Royce La Rose Noire Droptail" to 30_000_000,
    "Rolls-Royce Boat Tail" to 28_000_000,
    "Bugatti La Voiture Noire" to 18_700_000,
    "Pagani Zonda HP Barchetta" to 17_500_000,
    "Bugatti Centodieci" to 9_000_000

)
luxuryCars.forEach { (car, price) ->
    println("$car: '$'${price}")



}

val luxuryCars2 = mapOf(
    "Audi R8" to 142_700,
    "Audi RS7" to 114_000,
    "Audi Q8" to 68_200,
    "Audi A8" to 86_500,
    "Audi e-tron GT" to 99_900
)

luxuryCars2.forEach { (car, price) ->
    println("$car: \$${price}")
}


    println(describir(123)) // Imprime: Es un número entero
    println(describir("Hola")) // Imprime: Es una cadena de texto
    println(describir(true)) // Imprime: Es un valor booleano



val misetMutable: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5, 6)
println(misetMutable)

misetMutable.add(7)
println(misetMutable)
misetMutable.add(6)
println(misetMutable)



val cochesAudiPrecio: MutableMap<String, Int> = mutableMapOf(
    "Audi A1" to 15_000,
    "Audi A3" to 20_000,
    "Audi A4" to 25_000,
    "Audi R8" to 142_700,
    "Audi RS7" to 114_000,
    "Audi Q8" to 68_200,
    "Audi A8" to 86_500,
    "Audi e-tron GT" to 99_900
)


for( (clave, valor) in cochesAudiPrecio){
    println("modelo $clave -> precio $valor")

}
println("ingresa el numero a")
val a=readln().toInt()
println("ingresa el numero b")
val b=readln().toInt()

val multiplicar:(Int, Int)->Int={a,b->a*b}
val sumar:(Int, Int)->Int={a,b->a+b}

println(multiplicar(a,b))
println(sumar(a,b))



}












//hasta aqui el main



fun sumarNumeros3(numeros: List<Int>): Int {
    var total = 0
    for (numero in numeros) {
        total += numero
    }
    return total
}



fun sumarNumeros4(vararg numeros: Int): Int {
    var total = 0
    for (numero in numeros) {
        total += numero
    }
    return total
}


var lista1=mutableListOf(45,45,78,98,63,20, 200)
var numerosPares=lista1.filter{
    numero->numero%2==0
}


var lista2=(0..400).toList()
var numerosPares2=lista2.filter{
    numero->numero%2==0
}
val palabras = listOf("kotlin", "java", "swift", "javascript", "php", "python", "css" )
var palabrasFiltrada= palabras.filter{i->i.contains("j")}
var filtradoNumerosMayores=lista2.filter{i->i>=100}
var resultado=palabras.forEachIndexed{indice, valor->println("indice $indice, $valor")}


//clase producto
data class Producto(val tipo:String, val precio:Int)
//creamos una lista de varios productos
val listaProductos=listOf(
Producto("televisor led", 450),
Producto("play station 5", 600),
Producto("celular", 800),
Producto("tablet", 300),
Producto("computadora", 1200),
Producto("audifonos", 50),
Producto("teclado", 30),
Producto("mouse", 20),
Producto("monitor", 150),
Producto("impresora", 200),
Producto("disco duro", 100),
Producto("memoria usb", 10)
)



data class Usuario(val nombre: String, val edad: Int)

val usuarios = listOf(
    Usuario("Ana", 25),
    Usuario("Luis", 30),
    Usuario("Carlos", 35)
)



fun describir(objeto: Any): String {
    return when (objeto) {
        is Int -> "Es un número entero"
        is String -> "Es una cadena de texto"
        is Boolean -> "Es un valor booleano"
        else -> "Tipo desconocido"
    }
}


