package gt.edu.miumg.ejercicio1;

public class Elfo extends Personaje implements Heroe {

    public Elfo(String nombre, String descripcion, long tamano, int poder, int vida) {
        super(nombre, descripcion, tamano, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Ataca con un arco");
    }

    @Override
    public void defender() {
        System.out.println("Se defiende agilmente");

    }

    @Override
    public void recibirAtaque() {
        System.out.println("Recibe ataque.");
    }
}
