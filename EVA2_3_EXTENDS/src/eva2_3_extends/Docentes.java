                             
                                
package eva2_3_extends;         
//Superclase
public class Docentes extends Persona{
    private String Plaza;

    public Docentes() {
    }

    public Docentes(String Plaza) {
        this.Plaza = Plaza;
    }
        
    public String getPlaza() {
        return Plaza;
    }

    public void setPlaza(String Plaza) {
        this.Plaza = Plaza;
    }
    
    
}
