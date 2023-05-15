
package MisClases;

public class Television {
    private int Volumen;
    private int Canal;
    private boolean Power;
    
    public int getCanal(){
        return Canal;  
    }
    public void setCanal(int can){
        Canal = can;  
    }
    
    public int getVolumen(){
        return Volumen;  
    }
    public void setVolumen(int vol){
        Volumen = vol;  
    }
    
    public boolean getPower(){
        return Power;  
    }
    public void setPower(boolean pw){
       Power = pw;  
    }
}
