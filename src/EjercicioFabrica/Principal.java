package EjercicioFabrica;
//Probrar en campus https://www.youtube.com/watch?v=orUY4wpf7q4
public class Principal{
    public static void main(String[] args) {
        Fabrica f = new Fabrica();
        cargarFabrica(f);
    }
    private static void cargarFabrica(Fabrica f){
        
        Sucurdal s1 = new Sucurdal("Sucursal A");
        Sucurdal s2 = new Sucurdal("Sucursal A");
    
        s1.agregarInstrumento(new Instrumento("01", 25000, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("02", 350000, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("03", 100000, TipoInstrumento.PERCUSION));
    
        
        s2.agregarInstrumento(new Instrumento("10", 90000, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("11",800000, TipoInstrumento.VIENTO));
        s2.agregarInstrumento(new Instrumento("12", 200000, TipoInstrumento.PERCUSION));
    
        f.AgregarSucursal(s1);
        f.AgregarSucursal(s2);
        
    }
}