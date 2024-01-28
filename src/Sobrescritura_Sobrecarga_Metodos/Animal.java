package Sobrescritura_Sobrecarga_Metodos;

//Sobrecarga de metodos

public class Animal {
    
    private int id_animal;
    private String descripcion;

    //constructores

    //metodos getter and setters

    //Sobrecarga de metodos

    public void hacerSonido(){
        System.out.println("El animal esta haciendo un sonido....");
    }
    //Sobrecarga de metodos
    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal" + nombreAnimal + "hacer un sonido");
    }
    //Sobrecarga de metodos
    public void hacerSonido(String nombreAnimal,String tipoSonido){
        System.out.println("El animal"+nombreAnimal+"hace un sonido de tipo "+tipoSonido);
    }
}
