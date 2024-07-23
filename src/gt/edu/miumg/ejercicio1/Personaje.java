package gt.edu.miumg.ejercicio1;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamano;
    private int poder;
    private int vida;

    public Personaje(String nombre, String descripcion, long tamano, int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamano = tamano;
        this.poder = poder;
        this.vida = vida;
    }

    public void desplazarse(){
        System.out.println(" se está desplazando.");
    }

    public void mostrarVida(){
        System.out.println(" Vida: " + vida);
    }
    public void mostrarPoder(){
        System.out.println(" Poder: " + poder);
    }

}
