package EjercicioFabrica;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private List<Sucurdal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }

    public void AgregarSucursal(Sucurdal sur){
        this.sucursales.add(sur);
    }
}