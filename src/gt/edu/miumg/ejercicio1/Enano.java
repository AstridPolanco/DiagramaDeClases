package gt.edu.miumg.ejercicio1;

public class Enano extends Personaje implements Heroe{
    public Enano(String nombre, String descripcion, long tamano, int poder, int vida){
        super(nombre, descripcion, tamano, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Ataca con un hacha.");
    }

    @Override
    public void defender() {
        System.out.println("Defiende con un hacha.");

    }

    @Override
    public void recibirAtaque() {
        System.out.println("Recibe ataque.");
    }
}
