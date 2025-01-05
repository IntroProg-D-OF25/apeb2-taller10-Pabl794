import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }

        System.out.println("--- Tres en Raya ---");
        System.out.println("Jugador 1: X");
        System.out.println("Jugador 2: O");

        boolean hayGanador = false;
        boolean esEmpate = false;
        char turno = 'X';

        while (!hayGanador && !esEmpate) {
            // Mostrar el tablero
            System.out.println("\nTablero actual:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Turno del jugador " + (turno == 'X' ? "1 (X)" : "2 (O)"));
            System.out.print("Ingresa la fila (0, 1, 2): ");
            int fila = scanner.nextInt();
            System.out.print("Ingresa la columna (0, 1, 2): ");
            int columna = scanner.nextInt();

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
                tablero[fila][columna] = turno;

                hayGanador = false;
                for (int i = 0; i < 3; i++) {
                    if ((tablero[i][0] == turno && tablero[i][1] == turno && tablero[i][2] == turno) || 
                        (tablero[0][i] == turno && tablero[1][i] == turno && tablero[2][i] == turno)) { 
                        hayGanador = true;
                        break;
                    }
                }
                if ((tablero[0][0] == turno && tablero[1][1] == turno && tablero[2][2] == turno) ||
                    (tablero[0][2] == turno && tablero[1][1] == turno && tablero[2][0] == turno)) { 
                    hayGanador = true;
                }

                esEmpate = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (tablero[i][j] == '-') {
                            esEmpate = false;
                            break;
                        }
                    }
                    if (!esEmpate) break;
                }

                if (!hayGanador) {
                    turno = (turno == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }

        // Mostrar el tablero final
        System.out.println("\nTablero final:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        if (hayGanador) {
            System.out.println("¡El jugador " + (turno == 'X' ? "1 (X)" : "2 (O)") + " ha ganado!");
        } else if (esEmpate) {
            System.out.println("¡Es un empate!");
        }
    }
}
/*
--- Tres en Raya ---
Jugador 1: X
Jugador 2: O

Tablero actual:
- - - 
- - - 
- - - 
Turno del jugador 1 (X)
Ingresa la fila (0, 1, 2): 0
Ingresa la columna (0, 1, 2): 2

Tablero actual:
- - X 
- - - 
- - - 
Turno del jugador 2 (O)
Ingresa la fila (0, 1, 2): 2
Ingresa la columna (0, 1, 2): 1

Tablero actual:
- - X 
- - - 
- O - 
Turno del jugador 1 (X)
Ingresa la fila (0, 1, 2): 1
Ingresa la columna (0, 1, 2): 1

Tablero actual:
- - X 
- X - 
- O - 
Turno del jugador 2 (O)
Ingresa la fila (0, 1, 2): 2
Ingresa la columna (0, 1, 2): 0

Tablero actual:
- - X 
- X - 
O O - 
Turno del jugador 1 (X)
Ingresa la fila (0, 1, 2): 2
Ingresa la columna (0, 1, 2): 2

Tablero actual:
- - X 
- X - 
O O X 
Turno del jugador 2 (O)
Ingresa la fila (0, 1, 2): 0
Ingresa la columna (0, 1, 2): 0

Tablero actual:
O - X 
- X - 
O O X 
Turno del jugador 1 (X)
Ingresa la fila (0, 1, 2): 1
Ingresa la columna (0, 1, 2): 0

Tablero actual:
O - X 
X X - 
O O X 
Turno del jugador 2 (O)
Ingresa la fila (0, 1, 2): 2
Ingresa la columna (0, 1, 2): 2
Movimiento inválido. Intenta de nuevo.

Tablero actual:
O - X 
X X - 
O O X 
Turno del jugador 2 (O)
Ingresa la fila (0, 1, 2): 1
Ingresa la columna (0, 1, 2): 2

Tablero actual:
O - X 
X X O 
O O X 
Turno del jugador 1 (X)
Ingresa la fila (0, 1, 2): 0
Ingresa la columna (0, 1, 2): 1

Tablero final:
O X X 
X X O 
O O X 
¡Es un empate!
*/