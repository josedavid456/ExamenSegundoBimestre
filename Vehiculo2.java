package Vehiculo;
public class Vehiculo {
    //Atributos
    private int num_ruedas;
    private int velocidad_maxima;
    //Constructor
    public Vehiculo(int num_ruedas, int velocidad_maxima) {
        this.num_ruedas = num_ruedas;
        this.velocidad_maxima = velocidad_maxima;
    }
    //Getters and Setters
    public int getNum_ruedas() {
        return num_ruedas;
    }
    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }
    public int getVelocidad_maxima() {
        return velocidad_maxima;
    }
    public void setVelocidad_maxima(int velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }
    public void acelerar(){
        System.out.println("Mi velocidad maxima es de: ");
    }
}
