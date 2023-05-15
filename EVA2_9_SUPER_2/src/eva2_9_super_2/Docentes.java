package eva2_9_super_2;         
                                
public class Docentes extends Persona{
    private String Plaza;

    public Docentes() {
        super();
        this.Plaza = "--";
    }

    public Docentes(String nombre, String apellido, int edad, String Plaza) {
        super(nombre, apellido, edad);
        this.Plaza = Plaza;
    }   
        
    public String getPlaza() {
        return Plaza;
    }

    public void setPlaza(String Plaza) {
        this.Plaza = Plaza;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de la Plaza: "+this.Plaza);
    }
    
    
}
