
package eva2_16_interfaces;


public class EVA2_16_INTERFACES {

    public static void main(String[] args) {
        //MostrarDatos obj = new MostrarDatos(); No se instancia una interfaz
        
        Persona persona = new Persona("Jose", 45);
        persona.imprimirDatos();
        
        Computadora computadora = new Computadora("Lenovo", "i7", 20000, "Lenovo Legion");
        computadora.imprimirDatos();
    }
    
}
