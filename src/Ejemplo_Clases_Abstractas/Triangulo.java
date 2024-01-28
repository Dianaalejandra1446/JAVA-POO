package Ejemplo_Clases_Abstractas;

public class Triangulo extends Figura{
    private double altura;
    private double base;



    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }


    public Triangulo() {
       
    }

    @Override
    public double calcularArea() {
        double resultado = (altura*base)/2;
        return resultado;
    } 
    
}
