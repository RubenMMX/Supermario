package MarioBross;

import MarioBross.Enums.Estado;
import MarioBross.Enums.Movimiento;
import MarioBross.Enums.Nombres;

public abstract class Enemigo {
    private Nombres nombre;
    private int velocidad;
    private Estado estado;
    private Movimiento ejeMovimiento;

    public Enemigo( Nombres nombre) {
        this.velocidad = 2;
        this.nombre = nombre;
        this.estado = Estado.desactivado;
        this.ejeMovimiento = Movimiento.horizontal;
    }

    public Nombres getNombre() {
        return nombre;
    }

    public void setNombre(Nombres nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Movimiento getEjeMovimiento() {
        return ejeMovimiento;
    }

    public void setEjeMovimiento(Movimiento ejeMovimiento) {
        this.ejeMovimiento = ejeMovimiento;
    }

    public abstract void recibeAtaque(int daño);

    public abstract void aparecer();

    public final void desaparecer(){
        this.estado = Estado.eliminado;
    }
    public abstract void mostrar();
    @Override
    public abstract String toString();
}
