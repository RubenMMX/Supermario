package MarioBross;

public class Jugador {
    private int vida;
    private int nombre;

    public Jugador(int vida) {
        this.vida = vida;
    }

    public void recibeAtaque(){
        vida--;
    }
}
