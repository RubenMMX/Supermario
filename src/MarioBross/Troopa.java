package MarioBross;

public  class Troopa extends Enemigo {
    private int vida=2;

    public Troopa(int velocidad, String nombre, Estado estado, String ejeMovimiento, int vida) {
        super(velocidad, nombre, estado, ejeMovimiento);
        this.vida = vida;
    }
    public void recibeAtaque();


    public void aparecer();

}
