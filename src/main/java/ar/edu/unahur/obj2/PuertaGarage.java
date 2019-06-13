package ar.edu.unahur.obj2;

public class PuertaGarage {

    private boolean encendida = false;

    public void arriba() {
        encendida = true;
        System.out.println("Garage puerta arriba");
    }

    public void abajo() {
        encendida = false;
        System.out.println("Garage puerta abajo");
    }

    public void parar() {
        encendida = false;
        System.out.println("Garage puerta detenida");
    }

    public void encenderLuz() {
        System.out.println("Garage encender luz");
    }

    public void apagarLuz() {
        System.out.println("Garage apagar luz");
    }

    public boolean isEncendida() {
        return encendida;
    }
}
