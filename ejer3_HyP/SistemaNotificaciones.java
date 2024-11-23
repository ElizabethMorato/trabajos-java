package ejer3_HyP;

public class SistemaNotificaciones {
    public static void main(String[] args) {

        Notificaciones sistema = new Notificaciones();


        CorreoElectronico correo = new CorreoElectronico("Juan", "Bienvenido a nuestro servicio", "juan@example.com");
        MensajeTexto mensaje = new MensajeTexto("María", "Tu pedido ha sido enviado", "1234567890");

        sistema.agregarCanal(correo);
        sistema.agregarCanal(mensaje);

        System.out.println("Canales de notificaciones:");
        sistema.mostrarCanales();


        System.out.println("\nEnviando notificaciones:");
        sistema.enviarNotificaciones();

        System.out.println("\nPersonalizando mensajes:");
        sistema.personalizarMensajes("Mensaje personalizado para todos los usuarios.");

        System.out.println("\nEnvio de notificaciones personalizadas:");
        sistema.enviarNotificaciones();
    }
}
