package Ejercicio_Pokemon.Logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander(){
        
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander Este es mi ataque puño Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander Este es mi ataque Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander Este es mi ataue Ascuas");
    }
    
}
