package Ejercicio_Pokemon.Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        
        Squirtel squirtel = new Squirtel();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pika = new Pikachu();

 
        squirtel.atacarAraniazo();
        squirtel.atacarHidrobomba();
        System.out.println("\n");

        charmander.atacarLanzallamas();
        charmander.atacarAraniazo();
        System.out.println("\n");

        bulbasaur.atacarDrenaje();
        bulbasaur.atacarPalarizar();
        System.out.println("\n");

        pika.atacarPlacaje();
        pika.atacarRayo();
        System.out.println("\n");
    }
}
