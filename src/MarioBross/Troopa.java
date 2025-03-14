package MarioBross;

import MarioBross.Enums.Estado;
import MarioBross.Enums.Nombres;

public class Troopa extends Enemigo {
    private int vida ;

    public Troopa( Nombres nombre) {
        super( nombre);
        this.vida = 2;

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void recibeAtaque(int daño) {
        this.vida  -= daño;
        if (vida <= 0) {
            this.desaparecer();
        }
    }

    public void aparecer() {
        this.setEstado(Estado.visible);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Velocidad: "+getVelocidad());
        System.out.println("Estado: "+getEstado());
        System.out.println("Movimiento: "+getEjeMovimiento());
        System.out.println("Vida: "+this.vida);

    }

    @Override
    public String toString() {
         return "Troopa{" +
                "Apariencia='" + getNombre()+ '\'' +
                ", Estado='" + getEstado() + '\'' +
                ", Vida='" + getVida()+ '\'' +
                '}';
    }

}
