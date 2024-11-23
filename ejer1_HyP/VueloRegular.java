package ejer1_HyP;

public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioBasePorAsiento;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion() {
        // Aplicar una promoción, por ejemplo, un 10% de descuento
        precioBasePorAsiento *= 0.9;
    }
    public double getPrecioBasePorAsiento() {
        return precioBasePorAsiento;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

}
