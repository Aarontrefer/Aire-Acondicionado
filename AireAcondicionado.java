public class AireAcondicionado{
    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    private int cambioTemperaturas;
    private double maxTemperaturaAlcanzada;
    private double minTemperaturaAlcanzada;
    public AireAcondicionado(double minTem, double maxTem){
        temperatura = 15.0;
        min = minTem;
        max = maxTem;
        incremento = 5.0;
        cambioTemperaturas = 0;
        maxTemperaturaAlcanzada = temperatura;
        minTemperaturaAlcanzada = temperatura;
    }
    public double getTemperatura(){
        return temperatura;
    }
    
    public void setIncremento(double incre){
        if (incre >= 0){
            incremento = incre;
        }
    }
    
    public void subirTemperatura(){
        double maximo = temperatura + incremento;
        if(maximo <= max){
            temperatura += incremento;
            cambioTemperaturas += 1;
        }
        
        if(temperatura >= maxTemperaturaAlcanzada){
            maxTemperaturaAlcanzada = temperatura;
        }
     }
     
    public void bajarTemperatura(){
        double minimo = temperatura - incremento;
        if(minimo >= min){
            temperatura -= incremento;
            cambioTemperaturas += 1;
        }
        
        if(temperatura <= minTemperaturaAlcanzada){
            minTemperaturaAlcanzada = temperatura;
        }
    }
    
    public String getEstadisticas(){
        String estadistica ="La temperatura actual es: " + temperatura + " - la temperatura maxima posible es: " + max + " - la temperatura minima posible es: " +  min  + " - la temperatura maxima alcanzada es: " + maxTemperaturaAlcanzada + " - la temperatura minima alcanzada es: " + minTemperaturaAlcanzada + " - la temperatura se ha cambiado estas veces: " + cambioTemperaturas;
        return estadistica;
    }
    
    public void mostrarEstadisticas(){
         System.out.println("La temperatura actual es: " + temperatura + " - la temperatura maxima posible es: " + max + " - la temperatura minima posible es: " +  min  + " - la temperatura maxima alcanzada es: " + maxTemperaturaAlcanzada + " - la temperatura minima alcanzada es: " + minTemperaturaAlcanzada + " - la temperatura se ha cambiado estas veces: " + cambioTemperaturas);
    }






}