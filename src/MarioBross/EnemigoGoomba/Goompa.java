package MarioBross.EnemigoGoomba;

import MarioBross.Enums.Estado;
import MarioBross.Enums.Nombres;

public final class Goompa extends Enemigo {
    private int vida = 1;
    private String apariencia = "GOOMPA";

    public Goompa(Nombres nombre) {
        super(Nombres.Goompa);

    }

    public void recibeAtaque(int daño) {
        this.vida = this.vida - daño;
        if (vida <= 0) {
            this.desaparecer();
        }
    }

    public void aparecer() {
        this.setEstado(Estado.visible);
        System.out.println("EL enemigo "+this.getNombre()+" se muestra: " + apariencia+".");
    }

    @Override
    public void mostrar() {


        System.out.println("Nombre: " + getNombre());
        System.out.println("Velocidad: " + getVelocidad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Movimiento: " + getEjeMovimiento());
        System.out.println("vida: " + this.vida);
        System.out.println("Apariencia: " + this.apariencia);
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre='" + getNombre() + '\'' +
                ", Estado='" + getEstado() + '\'' +
                ", Vida='" + this.vida + '\'' +
                '}';
    }

    public void parar() {
        this.setVelocidad(0);
    }


}
