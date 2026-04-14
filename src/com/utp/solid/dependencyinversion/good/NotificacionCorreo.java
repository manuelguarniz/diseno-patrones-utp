package com.utp.solid.dependencyinversion.good;

public class NotificacionCorreo implements Notificacion {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}
