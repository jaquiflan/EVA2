package eva2_3_extends;

public class EVA2_3_EXTENDS {
    
    public static void main(String[] args) {
        Estudiante estu1 = new Estudiante();
        estu1.setNombre("Juan");
        estu1.setApellido("Jimenez");
        estu1.setEdad(19);
        estu1.setNoControl(1234567);
        
        System.out.println(estu1.getNombre());
        System.out.println(estu1.getApellido());
        System.out.println(estu1.getEdad());
        System.out.println(estu1.getNoControl());
        
        Docentes docente1 = new Docentes();
        docente1.setNombre("Jose");
        docente1.setApellido("Estrada");
        docente1.setEdad(30);
        docente1.setPlaza("abcdef");
        
        
    
    }
       
}

    class Persona{
        private String Nombre;
        private String Apellido;
        private int Edad;

        public Persona(){
        }

        public Persona(String nombre, String apellido, int edad) {
            this.Nombre = nombre;
            this.Apellido = apellido;
            this.Edad = edad;
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }
    
    
}


