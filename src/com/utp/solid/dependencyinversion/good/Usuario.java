package com.utp.solid.dependencyinversion.good;

public class Usuario {
    private NotificacionCorreo correo = new NotificacionCorreo();
    private NotificacionSMS sms = new NotificacionSMS();

    private Notificacion notificacion;

    public Usuario(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void enviarNotificacion(String mensaje) {
        notificacion.enviarNotificacion(mensaje);
    }

}
