class Rectangulo(private val base: Double, private val altura: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return base * altura
    }
}