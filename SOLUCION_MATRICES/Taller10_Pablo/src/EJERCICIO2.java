import java.util.Random;

public class EJERCICIO2 {

    public static void main(String[] args) {
        int filasA = 3, columnasA = 3; 
        int filasB = 3, columnasB = 3; 
        Random random = new Random();
        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[filasB][columnasB];

        String matrizAString = "Matriz A:\n";
        String matrizBString = "Matriz B:\n";
        String sumaString = "Suma de las matrices:\n";
        String multiplicacionString = "Multiplicación de las matrices:\n";

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizA[i][j] = random.nextInt(10); // Valores entre 0 y 9
                matrizAString += matrizA[i][j] + " ";
            }
            matrizAString += "\n";
        }

        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                matrizB[i][j] = random.nextInt(10); // Valores entre 0 y 9
                matrizBString += matrizB[i][j] + " ";
            }
            matrizBString += "\n";
        }

        if (filasA == filasB && columnasA == columnasB) {
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    sumaString += (matrizA[i][j] + matrizB[i][j]) + " ";
                }
                sumaString += "\n";
            }
        } else {
            sumaString = "No se pueden sumar las matrices (dimensiones incompatibles).\n";
        }

        if (columnasA == filasB) {
            int[][] multiplicacion = new int[filasA][columnasB];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    for (int k = 0; k < columnasA; k++) {
                        multiplicacion[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                    multiplicacionString += multiplicacion[i][j] + " ";
                }
                multiplicacionString += "\n";
            }
        } else {
            multiplicacionString = "No se pueden multiplicar las matrices (dimensiones incompatibles).\n";
        }

        String resultadoFinal = matrizAString + "\n" + matrizBString + "\n" + sumaString + "\n" + multiplicacionString;
        System.out.print(resultadoFinal);

       
    }
}
/*
Matriz A:
0 3 7 
2 0 5 
8 4 6 

Matriz B:
0 7 6 
9 2 4 
6 6 1 

Suma de las matrices:
0 10 13 
11 2 9 
14 10 7 

Multiplicación de las matrices:
69 48 19 
30 44 17 
72 100 70 
*/