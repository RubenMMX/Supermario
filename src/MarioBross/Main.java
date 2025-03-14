package MarioBross;

import MarioBross.EnemigoGoomba.Goompa;
import MarioBross.Enums.Nombres;
import Troopa.Koopa;
import Troopa.Paratroopa;
import Troopa.Pichon;

public class Main {
    public static void main(String[] args){
        Paratroopa p1 = new Paratroopa(Nombres.Paratroopa);
        Goompa g1 = new Goompa(Nombres.Goompa);
        Koopa k1 = new Koopa(Nombres.Koopa);
        Pichon pch1 = new Pichon(Nombres.Pichon);
        Koopa k2 = new Koopa(Nombres.Koopa);
        Goompa g2 = new Goompa(Nombres.Goompa);

        Partida.insertarEnemigo(p1);
        Partida.insertarEnemigo(k1);
        Partida.insertarEnemigo(g1);
        Partida.insertarEnemigo(g2);
        Partida.insertarEnemigo(pch1);

        p1.recibeAtaque(2);
        Partida.listaResumen();
        Partida.eliminar(p1);
        System.out.println("despyes de eliminar del array");
        Partida.listaResumen();

       




    }
}
