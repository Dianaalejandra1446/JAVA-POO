package Sobrescritura_Sobrecarga_Metodos;

public class Perro extends Animal {
    private String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;

    //constructores

    //Getters y setters
    @Override
    public void hacerSonido(){
        System.out.println("Soy un perro y ladro: GUA GUA");
    }
}
