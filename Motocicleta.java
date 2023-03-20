package Vehiculo;
public class Motocicleta extends Vehiculo {
     //Atributos
    private boolean tiene_casco;
    //Constructor
    public Motocicleta(boolean tiene_casco, int num_ruedas, int velocidad_maxima) {
        super(num_ruedas, velocidad_maxima);
        this.tiene_casco = tiene_casco;
    }
    //Getters and Setters
    public boolean isTiene_casco() {
        return tiene_casco;
    }
    public void setTiene_casco(boolean tiene_casco) {
        this.tiene_casco = tiene_casco;
    }
        @Override
     public void acelerar(){
         System.out.println("Aceleracion inicial");  
    }
}
