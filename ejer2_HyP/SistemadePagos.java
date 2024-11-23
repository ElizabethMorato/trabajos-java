package ejer2_HyP;


public class SistemadePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        TarjetaCredito tarjetaCredito1 = new TarjetaCredito("Isa Morato", "261574839", "12/25", "123");
        TarjetaCredito tarjetaCredito2 = new TarjetaCredito("Elizabeth Morato", "2630213101", "10/24", "456");
        PayPal payPal1 = new PayPal("Rocio Secotaro", "2615418101", "rocioSecotaro@gmail.com");

        pagos.agregarMetodoPago(tarjetaCredito1);
        pagos.agregarMetodoPago(tarjetaCredito2);
        pagos.agregarMetodoPago(payPal1);

        System.out.println("Informacion de los metodos de pago:");
        pagos.mostrarInformacion();

        System.out.println("Realizando pagos:");
        pagos.realizarPagos();

        System.out.println("Cancelando pagos:");
        pagos.cancelarPagos();
    }
}