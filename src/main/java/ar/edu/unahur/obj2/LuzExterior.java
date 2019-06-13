package ar.edu.unahur.obj2;

public class LuzExterior {

    private boolean encendida = false;

    void on() {
        encendida = true;
        System.out.println("Luz Exterior encendida");
    }

    void off() {
        encendida = false;
        System.out.println("Luz Exterior apagada");
    }

    public boolean isEncendida() {
        return encendida;
    }
}
