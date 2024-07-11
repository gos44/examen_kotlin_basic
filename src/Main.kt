fun main() {
    // 1. Función para Sumar Números Pares
/*
    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
    println(sumarPares(numeros)) // Debería imprimir 12 (2 + 4 + 6)

*/
    //2. Clase para Modelar un Producto
/*
    val laptop = Producto("Laptop X", 1500.0)
    laptop.mostrarPrecioConIVA() // Debería imprimir "Precio con IVA: 1740.0"
*/
    //3. Extensión de Función para Duplicar Números:
/*
    val numero = 5
    println(numero.duplicar()) // Debería imprimir 10
*/

    //4. Función de Orden Superior
/*
    println(aplicarOperacion(5, ::cuadrado)) // Debería imprimir 25
*/

    //5. Clase Abstracta y Herencia:
/*

    val rectangulo = Rectangulo(base = 5.0, altura = 3.0)
    val circulo = Circulo(radio = 2.5)
    println("Area del rectangulo es de :${rectangulo.calcularArea()}")
    println("Area del cirulo es de :${circulo.calcularArea()}")
*/

    //6. Perfil de Internet
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()


}

fun sumarPares(numeros: Array<Int>): Int {
    var suma = 0
    for (num in numeros) {
        if (num % 2 == 0) {
            suma += num
        }
    }
    return suma
}

fun aplicarOperacion (a: Int, funcion: (Int) -> Int): Int {
    return funcion(a)
}
fun cuadrado(numero: Int): Int {
    return numero * numero
}





