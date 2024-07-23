package gt.edu.miumg.ejercicio1;

public class Duende extends Personaje implements Villano{

    public Duende(String nombre, String descripcion, long tamano, int poder, int vida){
        super(nombre, descripcion, tamano, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Ataca con magia.");
    }

    @Override
    public void destruir() {
        System.out.println("Destruye con magia.");
    }
}
