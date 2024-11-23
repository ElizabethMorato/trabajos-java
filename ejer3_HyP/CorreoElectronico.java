package ejer3_HyP;


public class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;


    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo electronico: " + direccionCorreo);
        System.out.println("Usuario: " + usuario);
        System.out.println("Mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
        System.out.println("El mensaje del correo electrónico se ha personalizado");
    }
}

