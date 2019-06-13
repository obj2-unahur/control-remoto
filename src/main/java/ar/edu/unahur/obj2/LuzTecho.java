package ar.edu.unahur.obj2;

public class LuzTecho {

    private boolean encendida = false;

    void on() {
        encendida = true;
        System.out.println("Luz Techo encendida");
    }

    void off() {
        encendida = false;
        System.out.println("Luz Techo apagada");
    }

    void dim() {
        System.out.println("Luz Techo bajando intensidad");
    }

    public boolean isEncendida() {
        return encendida;
    }
}
