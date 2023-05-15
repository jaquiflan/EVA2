
package eva2_4_formato_apa;

public class EVA2_4_FORMATO_APA {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Editorial", 3);
        libro1.setAutor("Pedro lasco");
        libro1.setTitulo("Novelas Clasicas");
        libro1.setAño(2000);
        libro1.setMes("Abril");
        libro1.setDia(22);
        libro1.setCiudad("México");
        
        Articulo articulo1 = new Articulo("Heraldo", 17);
        articulo1.setAutor("Juan");
        articulo1.setTitulo("No soportó");
        articulo1.setAño(2023);
        articulo1.setMes("Febrero");
        articulo1.setDia(15);
        articulo1.setCiudad("Chihuahua");
        
        Informe informe1 = new Informe("Cientifico", "UNAM");
        informe1.setAutor("Marissa");
        informe1.setTitulo("El espacio");
        informe1.setAño(2021);
        informe1.setMes("Agosto");
        informe1.setDia(14);
        informe1.setCiudad("CDMX");
        
        SitioWeb sitio1 = new SitioWeb("https://github.com", "GitHub");
        sitio1.setAutor("Chris Wanstrath");
        sitio1.setTitulo("Discover projects");
        sitio1.setAño(2008);
        sitio1.setMes("Noviembre");
        sitio1.setDia(20);
        sitio1.setCiudad("San Francisco");
    }
    
}
