package Vehiculo;
public class Prueba_Vehiculos {
    public static void main(String[] args) {
        Vehiculo taxi = new Vehiculo(4,120);
        taxi.acelerar();
        
        System.out.println("-------------------------------");
        
        Automovil mazda = new Automovil(4, 10, 50 );
        mazda.acelerar();
        
         System.out.println("-------------------------------");
         
         Motocicleta honda = new Motocicleta(si,4, 90);
         honda.acelerar();
        
    }
}
