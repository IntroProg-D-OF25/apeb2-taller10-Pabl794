import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] inventario = new String[100][4]; // Máximo 100 productos
        int contadorProductos = 0;
        while (true) {
            System.out.println("\n--- Menú de Inventario y Facturación ---");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Facturar producto");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 1) {
                System.out.println("\n--- Inventario ---");
                if (contadorProductos == 0) {
                    System.out.println("El inventario está vacío.");
                } else {
                    System.out.printf("%-10s %-20s %-10s %-10s\n", "Código", "Nombre", "Precio", "Cantidad");
                    for (int i = 0; i < contadorProductos; i++) {
                        System.out.printf("%-10s %-20s %-10s %-10s\n",
                                inventario[i][0], inventario[i][1], inventario[i][2], inventario[i][3]);
                    }
                }
            } else if (opcion == 2) {
                if (contadorProductos >= 100) {
                    System.out.println("El inventario está lleno.");
                } else {
                    System.out.print("Ingresa el código del producto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el precio del producto: ");
                    String precio = scanner.nextLine();
                    System.out.print("Ingresa la cantidad del producto: ");
                    String cantidad = scanner.nextLine();
                    inventario[contadorProductos][0] = codigo;
                    inventario[contadorProductos][1] = nombre;
                    inventario[contadorProductos][2] = precio;
                    inventario[contadorProductos][3] = cantidad;
                    contadorProductos++;
                    System.out.println("Producto agregado al inventario.");
                }
            } else if (opcion == 3) {
                System.out.print("Ingresa el código del producto a facturar: ");
                String codigo = scanner.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < contadorProductos; i++) {
                    if (inventario[i][0].equalsIgnoreCase(codigo)) {
                        encontrado = true;
                        System.out.println("Producto encontrado: " + inventario[i][1]);
                        System.out.print("Ingresa la cantidad deseada: ");
                        int cantidadDeseada = scanner.nextInt();

                        int cantidadDisponible = Integer.parseInt(inventario[i][3]);
                        if (cantidadDeseada > cantidadDisponible) {
                            System.out.println("No hay suficientes existencias. Cantidad disponible: " + cantidadDisponible);
                        } else {
                            double precio = Double.parseDouble(inventario[i][2]);
                            double subtotal = cantidadDeseada * precio;

                            double iva = subtotal * 0.15;
                            double totalConIva = subtotal + iva;

                            double descuento = 0;
                            if (totalConIva > 100) {
                                descuento = totalConIva * 0.10; 
                                totalConIva -= descuento;
                            }

                            inventario[i][3] = String.valueOf(cantidadDisponible - cantidadDeseada);

                            System.out.println("\n--- Factura ---");
                            System.out.println("Producto: " + inventario[i][1]);
                            System.out.println("Cantidad: " + cantidadDeseada);
                            System.out.println("Precio unitario: $" + precio);
                            System.out.println("Subtotal: $" + subtotal);
                            System.out.println("IVA (15%): $" + iva);
                            if (descuento > 0) {
                                System.out.println("Descuento (10%): -$" + descuento);
                            }
                            System.out.println("Total a pagar: $" + totalConIva);
                        }
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
/*

--- Menú de Inventario y Facturación ---
1. Mostrar inventario
2. Agregar producto
3. Facturar producto
4. Salir
Selecciona una opción: 1

--- Inventario ---
El inventario está vacío.

--- Menú de Inventario y Facturación ---
1. Mostrar inventario
2. Agregar producto
3. Facturar producto
4. Salir
Selecciona una opción: 2
Ingresa el código del producto: 22
Ingresa el nombre del producto: arroz
Ingresa el precio del producto: 0.50
Ingresa la cantidad del producto: 50
Producto agregado al inventario.

--- Menú de Inventario y Facturación ---
1. Mostrar inventario
2. Agregar producto
3. Facturar producto
4. Salir
Selecciona una opción: 3
Ingresa el código del producto a facturar: 22
Producto encontrado: arroz
Ingresa la cantidad deseada: 30

--- Factura ---
Producto: arroz
Cantidad: 30
Precio unitario: $0.5
Subtotal: $15.0
IVA (15%): $2.25
Total a pagar: $17.25

--- Menú de Inventario y Facturación ---
1. Mostrar inventario
2. Agregar producto
3. Facturar producto
4. Salir
Selecciona una opción: 1

--- Inventario ---
Código     Nombre               Precio     Cantidad  
22         arroz                0.50       20      
*/