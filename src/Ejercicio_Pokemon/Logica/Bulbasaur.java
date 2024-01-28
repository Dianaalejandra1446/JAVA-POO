package Ejercicio_Pokemon.Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur(){
        
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur Este es mi ataque Drenage");
    }

    @Override
    public void atacarPalarizar() {
        System.out.println("Hola soy Bulbasaur Este es mi ataque Paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur Este es mi ataque Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur Este es mi ataque latigo Cepa");
    }
    
}
