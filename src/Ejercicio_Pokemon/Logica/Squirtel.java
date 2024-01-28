package Ejercicio_Pokemon.Logica;

public class Squirtel  extends Pokemon implements IAgua{

    public Squirtel(){
        
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtel y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtel y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtel y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtel Este es mi ataque Hidrobomba ");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtel Este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtel Este es mi ataque Pistola de Agua ");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtel Este es mi ataque Hidropulso");
    }
    
}
