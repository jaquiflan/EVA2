
package eva2_18_uso_interfaces;


public class Circulo implements Figuras, MostrarDatos{
    private double Radio;

    public Circulo() {
        this.Radio = 5;
    }

    public Circulo(double radio) {
        this.Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        this.Radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(Radio, 2);
    }

    @Override
    public double calcularPeri() {
        return Math.PI * (Radio * 2);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Radio: " + Radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPeri());
    }
    
    
    
}
