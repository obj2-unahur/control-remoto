package ar.edu.unahur.obj2;

import org.joda.time.DateTime;

public class LuzJardin {

    private boolean encendida = false;

    void manualOn() {
        encendida = true;
        System.out.println("Luz Jardin encendida");
    }

    void manualOff() {
        encendida = false;
        System.out.println("Luz Jardin apagada");
    }

    void definirHoraAnochecer(DateTime time) {
        System.out.println("Luz Jardin definiendo hora de anochecer:" + time);
    }

    void definirHoraAmanecer(DateTime time) {
        System.out.println("Luz Jardin definiendo hora de amanecer:" + time);
    }

    public boolean isEncendida() {
        return encendida;
    }
}
