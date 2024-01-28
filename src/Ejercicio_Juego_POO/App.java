package Ejercicio_Juego_POO;


public class App {
    public static void main(String[] args) throws Exception {
        Juego diablo2 = new Juego("Diablo 2", "Bizfrad", 2000);
        Expancion diablo2LOD = new Expancion("Diablo 2", "Diana Diaz", 2010, "Lord of Destruction", 2001);

        diablo2.mostrarInfo();
        diablo2LOD.mostrarInfo();
    }
}