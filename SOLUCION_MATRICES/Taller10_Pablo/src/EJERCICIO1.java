import java.util.Random;

public class EJERCICIO1 {

    public static void main(String[] args) {
        int m = 5; 
        int[][] matriz = new int[m][m];
        Random random = new Random();

        System.out.println("Matriz generada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(100); 
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nDiagonal principal: ");
        for (int i = 0; i < m; i++) System.out.print(matriz[i][i] + " ");

        System.out.print("\nDiagonal secundaria: ");
        for (int i = 0; i < m; i++) System.out.print(matriz[i][m - 1 - i] + " ");

        System.out.print("\nBajo diagonal principal: ");
        for (int i = 1; i < m; i++) for (int j = 0; j < i; j++) System.out.print(matriz[i][j] + " ");

        System.out.print("\nSobre diagonal principal: ");
        for (int i = 0; i < m; i++) for (int j = i + 1; j < m; j++) System.out.print(matriz[i][j] + " ");

        System.out.print("\nBajo diagonal secundaria: ");
        for (int i = 1; i < m; i++) for (int j = m - i; j < m; j++) System.out.print(matriz[i][j] + " ");

        System.out.print("\nSobre diagonal secundaria: ");
        for (int i = 0; i < m - 1; i++) for (int j = 0; j < m - 1 - i; j++) System.out.print(matriz[i][j] + " ");

        
    }
}
/*
Matriz generada:
  99  82  49  41  65
   1  87  16  48  99
  96  78  89   7  68
   8  15  68  63  85
  87  79  88  34  25

Diagonal principal: 99 87 89 63 25 
Diagonal secundaria: 65 48 89 15 87 
Bajo diagonal principal: 1 96 78 8 15 68 87 79 88 34 
Sobre diagonal principal: 82 49 41 65 16 48 99 7 68 85 
Bajo diagonal secundaria: 99 7 68 68 63 85 79 88 34 25 
Sobre diagonal secundaria: 99 82 49 41 1 87 16 96 78 8
*/