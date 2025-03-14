package Troopa;

import MarioBross.Enums.Movimiento;
import MarioBross.Enums.Nombres;

public class Paratroopa extends Troopa {
    private String apariencia = "PARATROOPA";
    private String tipo = "VOLADOR";

    public Paratroopa(Nombres nombre) {
        super(Nombres.Paratroopa);
        volar();
    }

    @Override
    public void recibeAtaque(int daño) {
        super.recibeAtaque(daño);
        if (getVida() == 2) {
            this.setEjeMovimiento(Movimiento.horizontal);
        }
    }
    public void volar(){
        this.setEjeMovimiento(Movimiento.vertical);
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
                ", Vida='" + getVida() + '\'' +
                '}';
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Apariencia: " + this.apariencia);
        System.out.println("Tipo: " + this.tipo);
    }
}
