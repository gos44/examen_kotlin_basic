class Circulo(private val radio: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }
}

