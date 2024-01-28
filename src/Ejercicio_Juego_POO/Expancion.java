package Ejercicio_Juego_POO;

//No admite herencia multiple 

public class Expancion extends Juego {
    private String tituloExpancion;
    private int lanzamientoExpancion;

    public Expancion(String titulo, String desarrollador, int lanzamiento, String tituloExpancion,int lanzamientoExpancion) {
        //Heredamos con super
        super(titulo, desarrollador, lanzamiento);
        this.tituloExpancion = tituloExpancion;
        this.lanzamientoExpancion = lanzamientoExpancion;
    }


    public String getTituloExpancion() {
        return tituloExpancion;
    }

    public void setTituloExpancion(String tituloExpancion) {
        this.tituloExpancion = tituloExpancion;
    }

    public int getLanzamientoExpancion() {
        return lanzamientoExpancion;
    }

    public void setLanzamientoExpancion(int lanzamientoExpancion) {
        this.lanzamientoExpancion = lanzamientoExpancion;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Titulo de expancion: "+tituloExpancion);
        System.out.println("Año de lanzamiento de la expancion: "+lanzamientoExpancion);
    }
    
}