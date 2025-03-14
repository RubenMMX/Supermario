package MarioBross;

public class Pichon extends Troopa {
    private String apariencia = "PICHON";

    public Pichon(String nombre) {
        super(nombre);
    }

    public void recibeAtaque(int daño) {
        super.recibeAtaque(daño);

    }

    public void aparecer() {
        super.aparecer();

    }
    @Override
    public String toString() {
        return "Pichon{" +
                "Apariencia='" + this.apariencia+ '\'' +
                ", Estado='" + getEstado() + '\'' +
                ", Vida='" + getVida()+ '\'' +
                '}';
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Apariencia:" + this.apariencia);
    }

}
