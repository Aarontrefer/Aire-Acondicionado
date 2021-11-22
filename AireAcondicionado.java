public class AireAcondicionado{
    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    public AireAcondicionado(double minTem, double maxTem){
        temperatura = 15.0;
        min = minTem;
        max = maxTem;
        incremento = 5.0;
    }
    public double getTemperatura(){
        return temperatura;
    }
    
    public void setIncre(double incre){
        incremento = incre;
    }
    
    public void subirTemperatura(){
        double maximo = temperatura + incremento;
        if(maximo <= max){
            temperatura += incremento;
        }
        else{
            temperatura += 0;
        }
     }
     
    public void bajarTemperatura(){
        double minimo = temperatura - incremento;
        if(minimo >= min){
            temperatura -= incremento;
        }
        else{
            temperatura += 0;
        }
    }






}