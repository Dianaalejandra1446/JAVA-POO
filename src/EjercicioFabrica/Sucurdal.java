package EjercicioFabrica;

import java.util.ArrayList;
import java.util.List;

public class Sucurdal {
    private List<Instrumento> instrumentos;
    private String nombre;

    public Sucurdal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento inst) {
        this.instrumentos.add(inst);
    }

    public void listarInstrumentos() {
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }
}
