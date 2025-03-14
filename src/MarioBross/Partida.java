package MarioBross;

import MarioBross.EnemigoGoomba.Enemigo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Partida {

    private static Enemigo[] arrayEnemigos = new Enemigo[5];



    public static void insertarEnemigo(Enemigo enemigo) {

        for (int i = 0; i < arrayEnemigos.length; i++) {

            if (arrayEnemigos[i] == null) {
                arrayEnemigos[i] = enemigo;
                enemigo.aparecer();
                System.out.println("Enemigo insertado: " + enemigo.getNombre());
                break;
            }

        }

    }

    public static void listaResumen() {
        for (int i = 0; i < arrayEnemigos.length; i++) {
            if (arrayEnemigos[i] != null) {
                System.out.println(arrayEnemigos[i].toString());
            }
        }
    }

    public static void listaCompleta() {
        for (int i = 0; i < arrayEnemigos.length; i++) {
            if (arrayEnemigos[i] != null) {
                arrayEnemigos[i].mostrar();
            }

        }

    }

    public static void eliminar(Enemigo enemigo) {
        for (int i = 0; i < arrayEnemigos.length; i++) {

            if (arrayEnemigos[i] == enemigo) {
                arrayEnemigos[i] = null;
                enemigo.desaparecer();
                System.out.println("Enemigo Eliminado: " + enemigo.getNombre());
                break;
            }
        }


    }

    public static void limpiar() {
        for (int i = 0; i < arrayEnemigos.length; i++) {
            arrayEnemigos[i] = null;

        }
        System.out.println("array limpio");
    }


}

