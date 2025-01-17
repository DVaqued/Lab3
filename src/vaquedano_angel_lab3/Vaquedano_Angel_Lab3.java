/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaquedano_angel_lab3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author angel
 */
public class Vaquedano_Angel_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        Random randomNumbers = new Random();

        int ejercicio = 0;
        String op = "";
        String opuser = "";
        int opcorrect = 0;

        while (true) {
            System.out.println("---Menu---");
            System.out.println("Ingrese 1 si quiere ir al ejercicio Piedra, Papel o Tijera"
                    + "\nIngrese 2 si quiere ir al ejercicio Suma."
                    + "\nIngrese 3 si desea ir al ejercicio 'Patrón numerico'");
            System.out.println("Favor ingrese el numero del ejercicio que desea realizar: ");
            ejercicio = lea.nextInt();

            //------------------------------------------------------------------------------
            String denuevo = "si";
            if (ejercicio == 1) {
                opcorrect = 0;
                while (denuevo.equals("si")) {
                    System.out.println("Bienvenido al juego de piedra papel o tijera.");
                    while (opcorrect == 0) {
                        System.out.println("Favor ingrese una opcion entre 'piedra', 'papel' o 'tijera': ");
                        opuser = lea.next().toLowerCase();
                        if (opuser.equals("piedra") || opuser.equals("papel") || opuser.equals("tijera")) {
                            opcorrect++;

                            System.out.println("Opcion valida.");
                        } else {
                            System.out.println("Favor ingrese una opcion valida.");
                        }
                    }
                    int opcomp = randomNumbers.nextInt(3);
                    String compu = "";

                    if (opcomp == 0) {
                        compu = "piedra";
                    } else if (opcomp == 1) {
                        compu = "papel";
                    } else if (opcomp == 2) {
                        compu = "tijera";
                    }

                    if (opuser.equals(compu)) {
                        System.out.println("La computadora saco " + compu);
                        System.out.println("Empate.");
                    } else if ((opuser.equals("piedra") && compu.equals("tijera")
                            || (opuser.equals("tijera") && compu.equals("papel")
                            || (opuser.equals("papel")) && compu.equals("piedra")))) {
                        System.out.println("La computadora saco " + compu);
                        System.out.println("Ganaste.");
                    } else {
                        System.out.println("Perdiste.");
                        System.out.println("La computadora saco " + compu);
                    }
                    opcorrect--;
                    System.out.println("Quiere volver a jugar: ");
                    denuevo = lea.next();

                }
            }
            if (ejercicio == 2) {
                int contador = 0;
                int resultado = 0;
                int cadenanumeros = 0;
                char numeroActual = 0;

                System.out.println("Favor ingrese una cadena de numeros: ");
                cadenanumeros = lea.nextInt();

                String cambio = Integer.toString(cadenanumeros);

                while (contador < cambio.length()) {
                    numeroActual = cambio.charAt(contador);
                    resultado += Character.getNumericValue(numeroActual);
                    contador++;
                    if (contador < cambio.length()) {
                        System.out.print(numeroActual + "+");
                    } else {
                        System.out.print(numeroActual);
                    }

                }
                System.out.println("=" + resultado);

            }
            if (ejercicio == 3) {
                System.out.println("Digite la cantidad de filas que desea que se realicen: ");
                int numero = lea.nextInt();
                for (int contador = 1; contador <= numero; contador++) {
                    for (int contador2 = 1; contador2 < contador; contador2++) {
                        System.out.print("  ");
                    }
                    for (int contador3 = numero; contador3 >= contador; contador3--) {
                        System.out.print(contador3 + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
