package eva2_9_super_2;

public class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
        super();
        this.noControl = "";
    }

    public Estudiante(String nombre, String apellido, int edad, String noControl) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }  

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //Remplazar el método imprimirDatos de la Super Clase
    @Override
    public void imprimirDatos(){     
        super.imprimirDatos();    
        System.out.println("No de control: "+this.noControl);
        
    } 
    
    
}
