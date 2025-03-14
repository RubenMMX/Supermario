package MarioBross;

import MarioBross.Enums.Nombres;

public class Pichon extends Troopa {
    private String apariencia = "PICHON";

    public Pichon(Nombres nombre) {
        super(Nombres.Pichon);
    }

    public void recibeAtaque(int daño) {
        super.recibeAtaque(daño);

    }

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

    public void mostrar() {
        super.mostrar();
        System.out.println("Apariencia:" + this.apariencia);
    }

}
