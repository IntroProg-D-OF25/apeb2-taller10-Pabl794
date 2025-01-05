import java.util.Random;

public class EJERCICIO3 {

    public static void main(String[] args) {
        int numEstudiantes = 28;
        String[] nombres = new String[numEstudiantes];
        double[][] notas = new double[numEstudiantes][3]; 
        double[] promedios = new double[numEstudiantes];
        Random random = new Random();

        for (int i = 0; i < numEstudiantes; i++) {
            nombres[i] = "Estudiante_" + (i + 1);
        }

        double sumaTotal = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            notas[i][0] = random.nextDouble() * 10; 
            notas[i][1] = random.nextDouble() * 10; 
            notas[i][2] = random.nextDouble() * 10; 
            promedios[i] = (notas[i][0] * 0.35) + (notas[i][1] * 0.35) + (notas[i][2] * 0.30);
            sumaTotal += promedios[i];
        }

        double promedioCurso = sumaTotal / numEstudiantes;

        System.out.println("Promedio del curso: " + promedioCurso);

        System.out.println("\nEstudiantes con promedio por encima del curso:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }

        System.out.println("\nEstudiantes con promedio por debajo del curso:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }

        double mayorPromedio = promedios[0];
        String mejorEstudiante = nombres[0];
        for (int i = 1; i < numEstudiantes; i++) {
            if (promedios[i] > mayorPromedio) {
                mayorPromedio = promedios[i];
                mejorEstudiante = nombres[i];
            }
        }
        System.out.println("\nEstudiante con el mayor promedio:");
        System.out.println(mejorEstudiante + " - Promedio: " + mayorPromedio);

        double menorPromedio = promedios[0];
        String peorEstudiante = nombres[0];
        for (int i = 1; i < numEstudiantes; i++) {
            if (promedios[i] < menorPromedio) {
                menorPromedio = promedios[i];
                peorEstudiante = nombres[i];
            }
        }
        System.out.println("\nEstudiante con el menor promedio:");
        System.out.println(peorEstudiante + " - Promedio: " + menorPromedio);

        
    }
}
/*
Promedio del curso: 4.650003042431768

Estudiantes con promedio por encima del curso:
Estudiante_1 - Promedio: 6.129017394672159
Estudiante_2 - Promedio: 5.340219886251655
Estudiante_3 - Promedio: 6.608703053523907
Estudiante_9 - Promedio: 6.882688123096736
Estudiante_10 - Promedio: 4.689802387277675
Estudiante_13 - Promedio: 6.206612025991282
Estudiante_17 - Promedio: 5.233377280174447
Estudiante_20 - Promedio: 5.994117602495811
Estudiante_22 - Promedio: 6.692823444692234
Estudiante_23 - Promedio: 8.101232560091006
Estudiante_24 - Promedio: 5.567354497359837
Estudiante_27 - Promedio: 5.753670608456009
Estudiante_28 - Promedio: 4.705249573672106

Estudiantes con promedio por debajo del curso:
Estudiante_4 - Promedio: 4.584660159715025
Estudiante_5 - Promedio: 3.5600862838880225
Estudiante_6 - Promedio: 3.110676231158124
Estudiante_7 - Promedio: 3.52761491263557
Estudiante_8 - Promedio: 3.6723316455957646
Estudiante_11 - Promedio: 4.374628963120811
Estudiante_12 - Promedio: 2.5839662702979256
Estudiante_14 - Promedio: 4.513877073362547
Estudiante_15 - Promedio: 3.6233564708242074
Estudiante_16 - Promedio: 3.583094975967652
Estudiante_18 - Promedio: 3.1633203216729364
Estudiante_19 - Promedio: 3.5705955809343846
Estudiante_21 - Promedio: 2.4371162936608366
Estudiante_25 - Promedio: 2.7236897074579445
Estudiante_26 - Promedio: 3.2662018600429024

Estudiante con el mayor promedio:
Estudiante_23 - Promedio: 8.101232560091006

Estudiante con el menor promedio:
Estudiante_21 - Promedio: 2.4371162936608366
BUILD SUCCESSFUL (total time: 0 seconds)
*/