package Ejercicio_Juego_POO;

public class Juego{
    private String titulo;
    private String desarrollador;
    private int lanzamiento;

    public Juego(String titulo, String desarrollador, int lanzamiento) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.lanzamiento = lanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    } 
    
    public void mostrarInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Desarrollador: "+desarrollador);
        System.out.println("Año de lanzamiento: "+lanzamiento);

    }
    
}