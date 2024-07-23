package gt.edu.miumg.ejercicio1;

public class Humano extends Personaje implements Heroe{
    public Humano(String nombre, String descripcion, long tamano, int poder, int vida){
        super(nombre, descripcion, tamano, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Ataca con una espada.");
    }

    @Override
    public void defender() {
        System.out.println("Defiende rapidamente");
    }

    @Override
    public void recibirAtaque() {
        System.out.println("Recibe ataque.");
    }
}
