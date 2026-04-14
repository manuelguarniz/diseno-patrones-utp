package com.utp.solid.dependencyinversion.good;

public class NotificacionSMS implements Notificacion {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
