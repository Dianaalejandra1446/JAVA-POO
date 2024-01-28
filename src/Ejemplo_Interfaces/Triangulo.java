package Ejemplo_Interfaces;

public class Triangulo implements Figura,Dibujable,Rotable{
    private double altura;
    private double base;


    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }



    @Override
    public double calcularArea() {
        double resultado = (altura*base)/2;
        return resultado;
    }



    @Override
    public void rotar() {
        System.out.println("Rotando...");
    }


    @Override
    public void dibujar() {
        System.out.println("Dibujando triangulo....");
    } 
    
}
