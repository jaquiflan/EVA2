
package eva2_16_interfaces;


public class Computadora extends Producto implements MostrarDatos{
    private String marca;
    private String procesador;

    public Computadora() {
        super();
    }

    public Computadora(String marca, String procesador, double precio, String nomProd) {
        super(precio, nomProd);
        this.marca = marca;
        this.procesador = procesador;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+ getNomProd());
        System.out.println("Precio: "+ getPrecio());
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
    }
    
    
    
}
