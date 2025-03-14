package MarioBross;

public class Main {
    public static void main(String[] args){
        Paratroopa p1 = new Paratroopa("PARAT1");
        Goompa g1 = new Goompa("gumpa");
        Koopa k1 = new Koopa("kupa");
        Pichon pch1 = new Pichon("pichoncillo");
        Partida.insertarEnemigo(p1);
        Partida.insertarEnemigo(k1);
        Partida.insertarEnemigo(g1);

        Partida.listaResumen();
       




    }
}
