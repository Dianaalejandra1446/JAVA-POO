package EjercicioFabrica;

public class Instrumento  {
    private String ID;
    private double precio;
    private TipoInstrumento tipo;

    public Instrumento(String iD, double precio, TipoInstrumento tipo) {
        ID = iD;
        this.precio = precio;
        this.tipo = tipo;
    }



    @Override
    public String toString() {
        return "Instrumento [ID=" + ID + ", precio=" + precio + ", tipo=" + tipo + "]";
    }

    
}
