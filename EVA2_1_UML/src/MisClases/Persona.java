

package MisClases;

public class Persona {
    private int Id;
    private int Edad;
    private String Nombre;
    
    public int getEdad(){
        return Edad;  
    }
    public void setEdad(int ed){
        Edad = ed;  
    }
    
    public int getId(){
        return Id;  
    }
    public void setId(int id){
        Id = id;  
    }
    
    public String getNombre(){
        return Nombre;  
    }
    public void setNombre(String val){
        Nombre = val;  
    }
}
