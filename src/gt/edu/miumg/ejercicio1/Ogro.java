package gt.edu.miumg.ejercicio1;

public class Ogro extends Personaje implements Villano{

    public Ogro(String nombre, String descripcion, long tamano, int poder, int vida) {
        super(nombre, descripcion, tamano, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Ataca con su mazo.");
    }

    @Override
    public void destruir() {
        System.out.println("Destruye todo a su paso.");
    }
}
