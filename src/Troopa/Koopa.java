package Troopa;

import MarioBross.Enums.Nombres;

public class Koopa extends Troopa {
    private String apariencia = "KOOPA.jpg";

    public Koopa( Nombres nombre) {
        super( Nombres.Koopa);

    }
    @Override
    public void recibeAtaque(int daño) {
        super.recibeAtaque(daño);

    }
    @Override
    public void aparecer() {
        super.aparecer();
        System.out.println("EL enemigo "+this.getNombre()+" se muestra: " + apariencia+".");

    }
    @Override
    public String toString() {
        return "{" +
                "Nombre='" + getNombre()+ '\'' +
                ", Estado='" + getEstado() + '\'' +
                ", Vida='" + getVida()+ '\'' +
                '}';
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Apariencia: "+this.apariencia);
    }

}
