//Declarar una variable constante para pi

    const val PI: Double = 3.1416

fun main(args: Array<String>) {
    //Declarar una variable decimal
    val decimal: Double = 3.14

    //Imprimir el tipo de dato asignado por defecto
    println("El tipo de dato por defecto para decimal es: ${decimal::class.simpleName}")


    //convertir la variable decimal a flotante

    val flotante: Float = decimal.toFloat()

        //calcular el perimetro de un circulo
    val perimetro = 2 * PI * decimal

    // Imprimir el resultado utilizando un String Template
    println("El perimetro del circulo es: $perimetro")

}