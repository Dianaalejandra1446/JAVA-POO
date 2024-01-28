package Ejemplo_Clases_Abstractas;

public class Main {
    public static void main(String[] args) {
        double altura = 10;
        double base = 5;
        Triangulo triangulo1 = new Triangulo(altura,base);
        System.out.println("Area del triangulo: "+triangulo1.calcularArea());
    }
}
