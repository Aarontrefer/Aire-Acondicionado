public class AireAcondicionado{
    private double temperatura;
    
    public AireAcondicionado(){
        temperatura = 15.0;
    }
    public double getTemperatura(){
        return temperatura;
    }
    
    public void subirTemperatura(){
        temperatura += 5;
     }
     
    public void bajarTemperatura(){
        temperatura -= 5;  
    }






}