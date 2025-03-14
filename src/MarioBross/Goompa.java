package MarioBross;

public final class Goompa extends Enemigo {
    private int vida=1;
    private String apariencia="GOOMPA";

    public Goompa(String nombre) {
        super( nombre);

    }

    public void recibeAtaque(int daño){
        this.vida = this.vida - daño;
        if (vida <= 0) {
            setEstado(Estado.eliminado);
        }
    }

    public  void aparecer(){
        this.setEstado(Estado.visible);
    }

    @Override
    public void mostrar() {



        System.out.println("Nombre: "+getNombre());
        System.out.println("Velocidad: "+getVelocidad());
        System.out.println("Estado: "+getEstado());
        System.out.println("Movimiento: "+getEjeMovimiento());
        System.out.println("vida: "+this.vida);
        System.out.println("Apariencia: "+this.apariencia);
    }
    @Override
    public String toString() {
        return "Goompa{" +
                "Apariencia='" + this.apariencia+ '\'' +
                ", Estado='" + getEstado() + '\'' +
                ", Vida='" + this.vida+ '\'' +
                '}';
    }

    public void parar(){
        this.setVelocidad(0);
    }



}
