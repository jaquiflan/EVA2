
package eva2_19_polimorfismo;

public class EVA2_19_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("Jesus", "Mendez", 18, "51233450");
        
        
        Docentes docente = new Docentes("Florencio", "Ramos", 55, "Tiempo Completo");
        
        
        //Ocultamos las diferencias
        Persona persona = docente;
        persona.imprimirDatos();
        Persona persona2 = estudiante;
        persona2.imprimirDatos();
        
        
        //No se puede hacer la conversion de superclase a subclase
                             
        Persona persona3 = new Persona();
        Docentes doce = persona3;
    }
    
    
}
