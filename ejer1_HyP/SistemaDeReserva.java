package ejer1_HyP;

public class SistemaDeReserva {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vueloRegular1 = new VueloRegular("V0001", "Madrid", "Barcelona", "2024-11-01", 120, 100);
        VueloRegular vueloRegular2 = new VueloRegular("V0002", "Paris", "Lyon", "2024-11-07", 155, 120);
        VueloCharter vueloCharter1 = new VueloCharter("V003", "Buenos Aires", "La Plata", "2024-11-05", 5000);

        reservas.agregarVuelo(vueloRegular1);
        reservas.agregarVuelo(vueloRegular2);
        reservas.agregarVuelo(vueloCharter1);

        System.out.println("Informacion de los vuelos antes de aplicar promociones:");
        reservas.mostrarInformacion();

        reservas.aplicarPromociones();

        System.out.println("Informacion de los vuelos después de aplicar promociones:");
        reservas.mostrarInformacion();

        System.out.println("Precio total de las reservas: " + reservas.calcularPrecioTotal());
    }
}