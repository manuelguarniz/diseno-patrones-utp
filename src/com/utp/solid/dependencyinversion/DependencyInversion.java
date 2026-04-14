package com.utp.solid.dependencyinversion;

import com.utp.solid.dependencyinversion.good.Notificacion;
import com.utp.solid.dependencyinversion.good.NotificacionCorreo;
import com.utp.solid.dependencyinversion.good.NotificacionSMS;
import com.utp.solid.dependencyinversion.good.Usuario;

public class DependencyInversion {
    static void main() {
        Notificacion notificacion = new NotificacionCorreo();

        Usuario usuario = new Usuario(notificacion);
        usuario.enviarNotificacion("Hola !!!!");

        notificacion = new NotificacionSMS();

        usuario = new Usuario(notificacion);
        usuario.enviarNotificacion("Hola 2 !!!!");
    }
}
