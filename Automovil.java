package Vehiculo;
public class Automovil extends Vehiculo {
     //Atributos
    private int num_puertas;
    //Constrcutor
    public Automovil(int num_puertas, int num_ruedas, int velocidad_maxima) {
        super(num_ruedas, velocidad_maxima);
        this.num_puertas = num_puertas;
    }
    //Getters and Setters
    public int getNum_puertas() {
        return num_puertas;
    }
    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }
    @Override
    public void acelerar(){
         System.out.println("Aceleracion incial");{
        }
    }
}