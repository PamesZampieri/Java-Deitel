/*
8.17 (Tres en raya) Cree una clase llamada TresEnRaya que le permita escribir un programa para jugar al “tres en raya”
(también conocido como “tres en línea”, “gato”, “triqui”, “michi” o “Tic-Tac-Toe”, entre otros nombres).
La clase debe contener un arreglo privado bidimensional de 3 por 3. Use un tipo enum para representar el valor en cada
celda del arreglo. Las constantes de la enum se deben llamar X, O y VACIO (para una posición que no contenga una X o una
O). El constructor debe inicializar los elementos del tablero con VACIO. Permita dos jugadores humanos.
Siempre que el primer jugador realice un movimiento, coloque una X en el cuadro especificado y coloque una O, siempre
que el segundo jugador realice un movimiento, el cual debe hacerse en un cuadro vacío. Luego en cada movimiento,
determine si alguien ganó el juego o si hay un empate. Si desea ir más allá, modifique su programa de manera que la
computadora realice los movimientos para uno de los jugadores. Además, permita que el jugador especifique si desea el
primer o segundo turno. Si se siente todavía más motivado, desarrolle un programa que reproduzca un juego de Tres en
raya tridimensional, en un tablero de 4 por 4 por 4 [Nota: ¡éste es un proyecto extremadamente retador!].
*/

package ejerciciosRealizados.unidad8;

import java.util.Scanner;

public class PruebaTresEnRaya {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenidos a nuestro juego Tres en Raya! Ingrese la opción deseada:");
            TresEnRaya juego = new TresEnRaya();

            System.out.println("1- JUGADOR CONTRA JUGADOR.");
            System.out.println("2- JUGADOR CONTRA LA COMPUTADORA.");
            System.out.println("3- TERMINAR.");
            opcion = entrada.nextInt();

            if (opcion != 3) {
                do {
                    juego.mostrarTablero();

                    if (opcion == 1) {
                        System.out.println("Primer jugador:");
                        System.out.println("Ingrese la fila:");
                        int fila = entrada.nextInt();
                        System.out.println("Ingrese la columna:");
                        int columna = entrada.nextInt();

                        try {
                            juego.realizarMovimiento(Valor.X, fila, columna);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }

                        juego.mostrarTablero();
                        mostrarResultado(juego.validarResultado());
                        System.out.println();

                        if (juego.validarResultado() == Resultado.GANADOR || juego.validarResultado() == Resultado.EMPATE) {
                            break;
                        }

                        System.out.println("Segundo jugador:");
                        System.out.println("Ingrese la fila:");
                        fila = entrada.nextInt();
                        System.out.println("Ingrese la columna:");
                        columna = entrada.nextInt();

                        try {
                            juego.realizarMovimiento(Valor.O, fila, columna);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }

                        juego.mostrarTablero();
                        mostrarResultado(juego.validarResultado());
                        System.out.println();

                        if (juego.validarResultado() == Resultado.GANADOR || juego.validarResultado() == Resultado.EMPATE) {
                            break;
                        }
                    }

                    if (opcion == 2) {
                        System.out.println("\nIndique quién comienza primero:");
                        System.out.println("1- JUGADOR.");
                        System.out.println("2- COMPUTADORA.");
                        int jugador = entrada.nextInt();

                        Valor valorJugador1 = Valor.X;
                        Valor valorJugador2 = Valor.O;

                        while (juego.validarResultado() == Resultado.CONTINUA) {

                            if (jugador == 1) {
                                System.out.println("Ingrese la fila:");
                                int fila = entrada.nextInt();
                                System.out.println("Ingrese la columna:");
                                int columna = entrada.nextInt();

                                try {
                                    juego.realizarMovimiento(valorJugador1, fila, columna);
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }

                                juego.mostrarTablero();
                                mostrarResultado(juego.validarResultado());
                                System.out.println();

                                if (juego.validarResultado() != Resultado.CONTINUA) {
                                    break;
                                }

                                System.out.println("Ahora es mi turno!");
                                juego.realizarMovimientoComputadora(valorJugador2);

                                juego.mostrarTablero();
                                mostrarResultado(juego.validarResultado());
                                System.out.println();

                                if (juego.validarResultado() != Resultado.CONTINUA) {
                                    break;
                                }

                            } else {
                                System.out.println("Es mi turno!");
                                juego.realizarMovimientoComputadora(valorJugador1);

                                juego.mostrarTablero();
                                mostrarResultado(juego.validarResultado());
                                System.out.println();

                                if (juego.validarResultado() != Resultado.CONTINUA) {
                                    break;
                                }

                                System.out.println("Ingrese la fila:");
                                int fila = entrada.nextInt();
                                System.out.println("Ingrese la columna:");
                                int columna = entrada.nextInt();

                                try {
                                    juego.realizarMovimiento(valorJugador2, fila, columna);
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }

                                juego.mostrarTablero();
                                mostrarResultado(juego.validarResultado());
                                System.out.println();

                                if (juego.validarResultado() != Resultado.CONTINUA) {
                                    break;
                                }
                            }
                        }
                    }

                } while (juego.validarResultado() == Resultado.CONTINUA);
            }
        } while (opcion == 1 || opcion == 2);
    }

    public static void mostrarResultado(Resultado resultado) {
        if (resultado == Resultado.GANADOR) {
            System.out.println("Felicitaciones! Es el ganador!");
        } else if (resultado == Resultado.EMPATE) {
            System.out.println("Hay empate.");
        } else if (resultado == Resultado.CONTINUA) {
            System.out.println("Continua el juego.");
        }
    }
}