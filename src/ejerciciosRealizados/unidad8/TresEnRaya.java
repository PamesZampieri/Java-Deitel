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

import java.security.SecureRandom;

public class TresEnRaya {
    private final Valor[][] tablero;
    private final SecureRandom numeroAleatorio = new SecureRandom();

    public TresEnRaya() {
        this.tablero = new Valor[][]{{Valor.VACIO, Valor.VACIO, Valor.VACIO},
                {Valor.VACIO, Valor.VACIO, Valor.VACIO},
                {Valor.VACIO, Valor.VACIO, Valor.VACIO}};

    }

    public void realizarMovimiento(Valor valor, int fila, int columna) {
        if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
            throw new IllegalArgumentException("Posición fuera del tablero. Coloque valores 0-2.");
        }

        if (!estaVacio(fila, columna)) {
            throw new IllegalArgumentException("El tablero en la posición elegida está ocupado.");
        }

        tablero[fila][columna] = valor;
    }

    public void realizarMovimientoComputadora(Valor valor) {
        boolean bandera = false;

        for (int i = 0; i < 10; i++) {
            int fila = numeroAleatorio.nextInt(3);
            int columna = numeroAleatorio.nextInt(3);

            if (estaVacio(fila, columna)) {
                tablero[fila][columna] = valor;
                bandera = true;
                break;
            }
        }

        if (!bandera) {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (estaVacio(i, j)) {
                        tablero[i][j] = valor;
                    }
                }
            }
        }
    }

    private boolean estaVacio(int fila, int columna) {
        return tablero[fila][columna] == Valor.VACIO;
    }

    public Resultado validarResultado() {
        if (hayGanador()) {
            return Resultado.GANADOR;
        }

        if (hayCeldasVacias()) {
            return Resultado.CONTINUA;
        }

        return Resultado.EMPATE;
    }

    public boolean hayGanador() {
        for (int i = 0; i < tablero.length; i++) {
            if (!estaVacio(i, 0) && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return true;
            }
        }

        for (int i = 0; i < tablero[0].length; i++) {
            if (!estaVacio(0, i) && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
                return true;
            }
        }

        if (!estaVacio(0, 0) && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return true;
        }

        return !estaVacio(0, 2) && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0];
    }

    private boolean hayCeldasVacias() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (estaVacio(i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    public void mostrarTablero() {
        for (Valor[] valores : tablero) {
            for (Valor valor : valores) {
                if (valor == Valor.X) {
                    System.out.print('X');
                }

                if (valor == Valor.O) {
                    System.out.print('O');
                }

                if (valor == Valor.VACIO) {
                    System.out.print('_');
                }
            }

            System.out.println();
        }
    }
}