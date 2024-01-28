package Ejemplo_Clases_Abstractas;

public abstract class Figura {
    //Protected para que solo las tenga las hijas
    protected double x;
    protected double y;

    


    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }


    protected Figura() {
    }

    public abstract double calcularArea();

}
