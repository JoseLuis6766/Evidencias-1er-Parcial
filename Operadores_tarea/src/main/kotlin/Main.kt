fun main(args: Array<String>) {
    //puntos p1 y p2
    val x1 = 4.0
    val y1 = 3.0
    val x2 = -3.0
    val y2 = -2.0

    //Calcular la pendiente

    val pendiente = (y2 - y1) / (x2 - x1)

    //imprimir la pendiente

    println("la pendiente entre los dos puntos P1($x1, $y1) y P2($x2, $y2) es: $pendiente")
}