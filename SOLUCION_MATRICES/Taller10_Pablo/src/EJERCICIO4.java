import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] inventario = new String[100][3]; 
        int contadorProductos = 0;

        while (true) {
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Actualizar existencias");
            System.out.println("4. Buscar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1) {
                System.out.println("\n--- Inventario ---");
                if (contadorProductos == 0) {
                    System.out.println("El inventario está vacío.");
                } else {
                    System.out.printf("%-20s %-10s %-10s\n", "Nombre", "Precio", "Cantidad");
                    for (int i = 0; i < contadorProductos; i++) {
                        System.out.printf("%-20s %-10s %-10s\n", inventario[i][0], inventario[i][1], inventario[i][2]);
                    }
                }
            } else if (opcion == 2) {
                if (contadorProductos >= 100) {
                    System.out.println("El inventario está lleno.");
                } else {
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el precio del producto: ");
                    String precio = scanner.nextLine();
                    System.out.print("Ingresa la cantidad del producto: ");
                    String cantidad = scanner.nextLine();
                    inventario[contadorProductos][0] = nombre;
                    inventario[contadorProductos][1] = precio;
                    inventario[contadorProductos][2] = cantidad;
                    contadorProductos++;
                    System.out.println("Producto agregado al inventario.");
                }
            } else if (opcion == 3) {
                System.out.print("Ingresa el nombre del producto a actualizar: ");
                String nombre = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < contadorProductos; i++) {
                    if (inventario[i][0].equalsIgnoreCase(nombre)) {
                        System.out.print("Ingresa la nueva cantidad: ");
                        inventario[i][2] = scanner.nextLine();
                        System.out.println("Cantidad actualizada para '" + nombre + "'.");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 4) {
                System.out.print("Ingresa el nombre del producto a buscar: ");
                String nombre = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < contadorProductos; i++) {
                    if (inventario[i][0].equalsIgnoreCase(nombre)) {
                        System.out.println("\n--- Producto Encontrado ---");
                        System.out.println("Nombre: " + inventario[i][0]);
                        System.out.println("Precio: " + inventario[i][1]);
                        System.out.println("Cantidad: " + inventario[i][2]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 5) {
                System.out.print("Ingresa el nombre del producto a eliminar: ");
                String nombre = scanner.nextLine();
                boolean eliminado = false;
                for (int i = 0; i < contadorProductos; i++) {
                    if (inventario[i][0].equalsIgnoreCase(nombre)) {
                        for (int j = i; j < contadorProductos - 1; j++) {
                            inventario[j] = inventario[j + 1];
                        }
                        contadorProductos--;
                        System.out.println("Producto eliminado del inventario.");
                        eliminado = true;
                        break;
                    }
                }
                if (!eliminado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 6) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
/*
--- Menú de Inventario ---
1. Mostrar inventario
2. Agregar producto
3. Actualizar existencias
4. Buscar producto
5. Eliminar producto
6. Salir
Selecciona una opción: 1

--- Inventario ---
El inventario está vacío.

--- Menú de Inventario ---
1. Mostrar inventario
2. Agregar producto
3. Actualizar existencias
4. Buscar producto
5. Eliminar producto
6. Salir
Selecciona una opción: 2
Ingresa el nombre del producto: papas
Ingresa el precio del producto: 1
Ingresa la cantidad del producto: 100
Producto agregado al inventario.

--- Menú de Inventario ---
1. Mostrar inventario
2. Agregar producto
3. Actualizar existencias
4. Buscar producto
5. Eliminar producto
6. Salir
Selecciona una opción: 1

--- Inventario ---
Nombre               Precio     Cantidad  
papas                1          100       

*/