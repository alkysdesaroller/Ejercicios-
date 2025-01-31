/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_ejerciciodefitivo;
import java.util.Scanner;
public class Java_EjercicioDefitivo {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú de opciones
        System.out.println("Bienvenido al programa integrado de ejercicios.");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Imprimir nombre y correo electrónico.");
        System.out.println("2. Realizar operaciones matemáticas básicas.");
        System.out.println("3. Imprimir números impares del 1 al 100.");
        System.out.println("4. Imprimir números pares del 2 al 100.");
        System.out.println("5. Calcular la sumatoria de los números del 1 al 50.");
        System.out.println("6. Imprimir una tabla de multiplicar.");
        System.out.println("7. Determinar cuál de dos números es mayor.");
        System.out.println("8. Determinar si un número es par o impar.");
        System.out.print("Ingrese el número de la opción que desea ejecutar: ");
        opcion = scanner.nextInt();

        // Switch para manejar las opciones
        switch (opcion) {
            case 1:
                // Ejercicio 1: Imprimir nombre y correo electrónico
                System.out.println("Bienvenido, digite su nombre:");
                scanner.nextLine(); // Limpiar el buffer
                String name = scanner.nextLine();
                System.out.println("Digite su correo:");
                String correo = scanner.nextLine();
                System.out.println("Su nombre es: " + name + ", y su correo es: " + correo);
                break;

            case 2:
                // Ejercicio 2: Operaciones matemáticas básicas
                System.out.println("Bienvenidos a su calculadora básica.");
                System.out.println("Ingrese el numero 1:");
                int num1 = scanner.nextInt();
                System.out.println("Ingrese el numero 2:");
                int num2 = scanner.nextInt();

                int suma = num1 + num2;
                int resta = num1 - num2;
                int multiplicacion = num1 * num2;
                int division = num1 / num2;

                System.out.println("La suma de los 2 números: " + suma);
                System.out.println("La resta de los 2 números: " + resta);
                System.out.println("La multiplicación de los 2 números: " + multiplicacion);
                System.out.println("La división de los 2 números: " + division);
                break;

            case 3:
                // Ejercicio 3: Números impares del 1 al 100
                System.out.println("Números impares del 1 al 100:");
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;

            case 4:
                // Ejercicio 4: Números pares del 2 al 100
                System.out.println("Estos son solo números pares del 2 al 100:");
                int i = 2;
                while (i <= 100) {
                    System.out.println(i);
                    i += 2;
                }
                break;

            case 5:
                // Ejercicio 5: Sumatoria de los números del 1 al 50
                System.out.println("Esta es la sumatoria de los números del 1 al 50:");
                int contador = 1;
                int sumatoria = 0;
                do {
                    sumatoria += contador;
                    contador++;
                } while (contador <= 50);
                System.out.println("La suma de los números del 1 al 50 es: " + sumatoria);
                break;

            case 6:
                // Ejercicio 6: Tabla de multiplicar
                System.out.println("Ingrese el número de la tabla que quiere generar:");
                int number = scanner.nextInt();
                System.out.println("Tabla de multiplicar del " + number + ":");
                for (int j = 1; j <= 12; j++) {
                    System.out.println(number + " x " + j + " = " + (number * j));
                }
                break;

            case 7:
                // Ejercicio 7: Determinar cuál de dos números es mayor
                System.out.println("Ingrese el numero A:");
                int numA = scanner.nextInt();
                System.out.println("Ingrese el numero B:");
                int numB = scanner.nextInt();

                if (numA > numB) {
                    System.out.println("El numero A es mayor.");
                } else if (numB > numA) {
                    System.out.println("El numero B es mayor.");
                } else {
                    System.out.println("Los números son iguales.");
                }
                break;

            case 8:
                // Ejercicio 8: Determinar si un número es par o impar
                System.out.println("Ingrese un número, por favor:");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println("El número ingresado es par!!!");
                } else {
                    System.out.println("El número ingresado es impar!!");
                }
                break;

            default:
                // Opción no válida
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 8.");
                break;
         }
       }
    }
    

