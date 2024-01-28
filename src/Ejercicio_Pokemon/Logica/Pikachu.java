package Ejercicio_Pokemon.Logica;

public class Pikachu  extends Pokemon  implements IElectrico{

    public Pikachu(){
        
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy pikachu Este es mi ataque Impacta Trueno");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy pikachu Este es mi ataque Puño Fuego ");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy pikachu Este es mi ataque Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(" Hola soy pikachu Este es mi ataque Rayo Carga");
    }
    
}
