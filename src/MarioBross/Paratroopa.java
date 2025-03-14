package MarioBross;

import java.sql.SQLOutput;

public class Paratroopa extends Troopa {
    private String apariencia = "PARATROOPA";
    private String tipo = "VOLADOR";

    public Paratroopa(String nombre) {
        super(nombre);
        this.setEjeMovimiento(Movimiento.vertical);
    }

    @Override
    public void recibeAtaque(int daño) {
        super.recibeAtaque(daño);
        if (getVida() == 2) {
            this.setEjeMovimiento(Movimiento.horizontal);
        }
    }

    @Override
    public void aparecer() {
        super.aparecer();
    }

    @Override
    public String toString() {
        return "Paratroopa{" +
                "Apariencia='" + this.apariencia + '\'' +
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
