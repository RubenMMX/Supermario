package MarioBross.EnemigoGoomba;

public class Jugador {
    private int vida;


    public Jugador(int vida, int nombre) {
        this.vida = vida;

    }



    public void recibeAtaque(){
        this.vida --;

    }
}
