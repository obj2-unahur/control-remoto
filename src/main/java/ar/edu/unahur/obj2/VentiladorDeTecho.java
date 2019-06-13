package ar.edu.unahur.obj2;

public class VentiladorDeTecho {

    private boolean encendida = false;

    public void fuerte() {
        encendida = true;
        System.out.println("Ventilador de techo velocidad fuerte");
    }

    public void media() {
        encendida = true;
        System.out.println("Ventilador de techo velocidad media");
    }

    public void baja() {
        encendida = true;
        System.out.println("Ventilador de techo velocidad baja");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Ventilador de apagado");
    }

    public boolean isEncendida() {
        return encendida;
    }
}
