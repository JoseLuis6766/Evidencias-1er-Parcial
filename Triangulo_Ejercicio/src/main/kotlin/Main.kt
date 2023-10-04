fun determinarTipoTriangulo(a: Double, b: Double, c: Double) {
    if (a == b && b == c) {
        println("El triángulo es equilátero, todos los lados son iguales.")
    } else if (a == b || a == c || b == c) {
        println("El triángulo es isósceles, tiene dos lados iguales.")
    } else {
        println("El triángulo es escaleno, todos los lados son diferentes.")
    }
}

fun main() {
    val ladoA = 3.0
    val ladoB = 4.0
    val ladoC = 5.0

    determinarTipoTriangulo(ladoA, ladoB, ladoC)
}
