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

public enum Valor {
    X,
    O,
    VACIO;
}