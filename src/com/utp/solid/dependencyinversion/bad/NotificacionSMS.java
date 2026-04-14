package com.utp.solid.dependencyinversion.bad;

public class NotificacionSMS {
    public void enviarSMS(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
