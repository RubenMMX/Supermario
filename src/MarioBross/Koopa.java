package MarioBross;

public class Koopa extends Troopa {
    private String apariencia = "KOOPA";

    public Koopa( String nombre) {
        super( nombre);

    }
    @Override
    public void recibeAtaque(int daño) {
        super.recibeAtaque(daño);

    }
    @Override
    public void aparecer() {
        super.aparecer();

    }
    @Override
    public String toString() {
        return "Koopa{" +
                "Apariencia='" + this.apariencia+ '\'' +
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
