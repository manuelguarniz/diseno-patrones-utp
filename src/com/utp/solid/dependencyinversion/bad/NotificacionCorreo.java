package com.utp.solid.dependencyinversion.bad;

public class NotificacionCorreo {
    public void enviarEmail(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}
