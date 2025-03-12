package MarioBross;

public final class Goompa extends Enemigo {
    private int vida=1;
    private String apariencia="GOOMPA";

    public Goompa(int velocidad, String nombre, Estado estado, String ejeMovimiento, String apariencia, int vida) {
        super(velocidad, nombre, estado, ejeMovimiento);
        this.apariencia = apariencia;
        this.vida = vida;
    }

    public void recibeAtaque(){
            this.vida--;
    }

    public  void aparecer(){

    }
    public void parar(){
        this.setVelocidad(0);
    }


}
